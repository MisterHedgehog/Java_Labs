package com.laba18;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FileManager {

    private ArrayList<Serializable> objects;
    private String localPath;

    private FileManager() {
        objects = new ArrayList<>();
        String clName = getClass().getName();
        String dir = clName.substring(0, clName.lastIndexOf(".")) + ".data";
        localPath = "src//" + dir.replace(".","//");
    }

    static FileManager init(){
        return new FileManager();
    }

    FileManager addClasses(Serializable... cls){
        objects.addAll(Arrays.asList(cls));
        return this;
    }
    FileManager createFolders(){
        // Создание массива имён классов
        String[] classArray = objects.stream().map(cl -> cl.getClass().getSimpleName()).toArray(String[]::new);
        // Удаление повторений
        HashSet<String> classPaths = new HashSet<>(Arrays.asList(classArray));
        // Создание папки для каждого класса
        classPaths.forEach(cl ->{
            // Создание пути из имени класса "src//com//laba17//data//Fruit"
            File file = new File(localPath + "//" + cl);
            file.mkdirs();
        });
        return this;
    }
    FileManager saveClasses(){
        objects.forEach(o ->
        {
            try {
                Path path = Paths.get(localPath + "//" + o.getClass().getSimpleName()
                        + "//" + o.getClass().getField("name").get(o));
                // Запись данных об объекте в файл
                try(ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(path.toFile()))){
                    stream.writeObject(o);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        return this;
    }
    <T>ArrayList<T> loadClasses(){
        ArrayList<T> data = new ArrayList<>();
        try {
            File file = new File(localPath);
            // Извлечение данных из файла
            if(file.isDirectory())
            for (File listFile : file.listFiles()) {
                if(listFile.isDirectory())
                for(File f : listFile.listFiles()){
                    try(ObjectInputStream stream = new ObjectInputStream(new FileInputStream(f))){
                        data.add((T)stream.readObject());
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return data;
    }
    FileManager saveState(State state){
        File file = new File(localPath);
        file.mkdirs();
        file = new File(file, "state.dat");
        try {
            try(ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(file))){
                stream.writeObject(state);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return this;
    }
    State loadState(){
        File file = new File(localPath);
        file.mkdirs();
        file = new File(file, "state.dat");
        try {
            try(ObjectInputStream stream = new ObjectInputStream(new FileInputStream(file))){
                return (State) stream.readObject();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}

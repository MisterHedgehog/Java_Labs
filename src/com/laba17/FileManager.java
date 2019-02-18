package com.laba17;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileManager {

    private ArrayList<Savable> objects;
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

    FileManager addClasses(Savable... cls){
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
    void saveClasses(){
        objects.forEach(o ->
        {
            try {
                Path path = Paths.get(localPath + "//" + o.getClass().getSimpleName() +
                        "//" + o.getClass().getField("name").get(o));
                // Запись данных об объекте в файл
                Files.write(path, o.classData());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}

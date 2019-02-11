package com.laba14;

class Crypto {
    static String code(String text){
        text = text.replaceAll("\\s+","");
        int textLength = text.length();
        double sqrt = Math.sqrt(textLength);
        int tableSize = (int) Math.ceil(sqrt);
        char[][] table = new char[tableSize][tableSize];
        int i = 0;
        for (char[] chars : table) {
            for (int j = 0; j < table.length; j++) {
                if(i < textLength)
                    chars[j] = text.charAt(i++);
                else
                    chars[j] = '*';
            }
        }
        Crypto.showTable(table, "Исходная таблица:");
        StringBuilder stringBuilder = new StringBuilder();
        for (i = table.length - 1; i >= 0; i--) {
            for (char[] chars : table) {
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }

    static String decode(String text){
        int textLength = text.length();
        int tableSize = (int) Math.sqrt(textLength);
        if (textLength != tableSize * tableSize)
            throw new IllegalArgumentException("Ошибка при расшифровки: строку невозможно преобразовать в таблицу");
        char[][] table = new char[tableSize][tableSize];
        for (int i = 0; i < tableSize; i++) {
            for (int j = tableSize - 1; j >= 0; j--) {
                table[j][i] = text.charAt(--textLength);
            }
        }
        Crypto.showTable(table, "Таблица шифра:");
        StringBuilder stringBuilder = new StringBuilder();
        for (char[] chars : table) {
            for (int j = 0; j < table.length; j++) {
                char c = chars[j];
                if (c != '*')
                    stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    /**
     *
     * @param table
     * @param title
     */
    private static void showTable(char[][] table, String title){
        System.out.println(title);
        for (char[] chars : table) {
            for (int j = 0; j < table.length; j++) {
                System.out.print(chars[j] + " ");
            }
            System.out.println();
        }
    }
}

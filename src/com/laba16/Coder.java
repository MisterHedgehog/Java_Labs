package com.laba16;

class Coder {
    // Переменная id используется только для демонстрации работы синхронных потоков.
    private int id;
    private String text, code, decode;

    public Coder(String text) throws CryptoException {
        id = 1;
        startCoding(text);
    }

    public void startCoding(String input) throws CryptoException {
        if (input.isBlank())
            throw new CryptoException("Ошибка при шифровании: невозможно зашифровать пустую строку");
        new Thread(() -> setText(input)).start();
    }

    public String getDecode() {
        return decode;
    }

    public String getText() {
        return text;
    }

    public String getCode() {
        return code;
    }

    private synchronized void setText(String text) {
        System.out.println("Процесс шифрации номер " + id++);
        try {
            // Остановка потока используется только для демонстрации работы синхронных потоков.
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.text = text;
        code();
    }

    private void setCode(String code) {
        this.code = code;
        decode();
    }

    private void setDecode(String decode) {
        this.decode = decode;
    }

    private void code() {
            text = text.replaceAll("\\s+", "");
            int textLength = text.length();
            double sqrt = Math.sqrt(textLength);
            int tableSize = (int) Math.ceil(sqrt);
            char[][] table = new char[tableSize][tableSize];
            int i = 0;
            for (char[] chars : table) {
                for (int j = 0; j < table.length; j++) {
                    if (i < textLength)
                        chars[j] = text.charAt(i++);
                    else
                        chars[j] = '*';
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (i = table.length - 1; i >= 0; i--) {
                for (char[] chars : table) {
                    stringBuilder.append(chars[i]);
                }
            }
            setCode(stringBuilder.toString());
    }

    private void decode() {
        int textLength = code.length();
        int tableSize = (int) Math.sqrt(textLength);
        char[][] table = new char[tableSize][tableSize];
        for (int i = 0; i < tableSize; i++) {
            for (int j = tableSize - 1; j >= 0; j--) {
                table[j][i] = code.charAt(--textLength);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char[] chars : table) {
            for (int j = 0; j < table.length; j++) {
                char c = chars[j];
                if (c != '*')
                    stringBuilder.append(c);
            }
        }
        setDecode(stringBuilder.toString());
    }
}

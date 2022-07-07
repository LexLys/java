package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

//git init - подключаем Git

// Создаем файл .gitignore
// В файле .gitignore пишем:
// *.sass
// /bin
// /admin
// /config

// Сохраняем

// Добавьте все файлы в локальное хранилище;
// git add -A
// git commit -m "DZ 5 local"

// Создайте новую ветку и перейдите в неё;
// git branch newDZ5
// git checkout newDZ5

// В новой ветке создайте папку blog с файлами: index.js, index.html;
// переходим на ветку newDZ5
// создаем папку в ней 2 файла по заданию
// Далее прописываем:
// git add .                        - добавляем все файлы
// git commit -m "DZ 5 second"      - коммитим
// git status                       - проверяем

// Загрузите на удаленный репозиторий лишь основную ветку вашего проекта.
// git remote add origin https://github.com/LexLys/java.git  - подключаемся к удаленному репозиторию
// git push -u origin main   - записываем ветку main в удаленный репозиторий



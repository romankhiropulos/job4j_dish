# job4j_dish

## Описание проекта.
Данный проект, созданный на REST принципах, является частью будущего проекта для построения проекта на принципах микросервисной архитектуры.

### Стек.
#### Java 17
#### Spring Boot 2.+
#### Spring Data
#### PostgreSQL 14
#### lombok

### Запуск проекта.

#### 1) Предварительно установим Docker compose1. Скачиваем пакет
###### sudo curl -L "https://github.com/docker/compose/releases/download/1.28.6/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose

#### 2) Выделяем права
###### sudo chmod +x /usr/local/bin/docker-compose

#### 3) Скачиваем проект job4j_dish:
###### git clone путь_к_репозиторию

#### 4) Переходим в проект job4j_dish:
###### cd job4j_dish

#### 5) Запускаем команду сборки:
###### docker-compose build

#### 6) Запустим образ:
###### docker-compose run job4j_dish
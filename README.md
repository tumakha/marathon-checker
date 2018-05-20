# Marathon Checker #

## Build & Run ##

```sh
$ cd marathon-checker
$ sbt
> jetty:start
> browse
```

## Automatic code reloading ##

```sh
$ cd marathon-checker
$ sbt
> ~;jetty:stop;jetty:start
```

## Usage ##

<http://localhost:8080/?hosts=host1:8080,host2&apps=app-name,-name2-,name3>
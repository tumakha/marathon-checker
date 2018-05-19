# Marathon Checker #

## Build & Run ##

```sh
$ cd marathon-checker
$ sbt
> jetty:start
> browse
```

If `browse` doesn't launch your browser, manually open [http://localhost:8080/](http://localhost:8080/) in your browser.

## Automatic code reloading ##

```sh
$ cd marathon-checker
$ sbt
> ~;jetty:stop;jetty:start
```
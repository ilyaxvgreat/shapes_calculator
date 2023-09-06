# A small project to calculate area and perimeter depends on shape

### Local run:

Requirements:

- java 17
- maven 3.8.4

Build:

- in /task directory run maven command depends on your OS

```
mvn clean install
```

Run:

- in generated /target directory run command

```
java -jar .\task-0.0.1-SNAPSHOT.jar
```

application will be run on port :8080

### Api:

- supported shapeType : square , rectangle , triangle , circle
  Requests:

```
url localhost:8080/shapes
method GET
```

Request body examples:

```json
{
  "shapeType": "square",
  "side": 1
}
```

```json
{
  "shapeType": "rectangle",
  "width": 10,
  "height": 1
}
```

```json
{
  "shapeType": "triangle",
  "side": 10,
  "height": 1
}
```

```json
{
  "shapeType": "circle",
  "radius": 0
}
```

Response example:

```json
{
  "area": 5.0,
  "perimeter": 30.0
}
```

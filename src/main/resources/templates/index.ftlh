[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Kalendářové výpočty</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="d-flex flex-column justify-content-center align-items-center min-vh-100">
    <h1>Kalendářové výpočty</h1>
    <form class="px-5" action="/vypocet">
        <div class="row g-3 align-items-center">
            <div class="col-auto">
                <label for="rok">Rok</label>
            </div>
            <div class="col-auto">
                <input id="rok" name="rok" type="number" class="form-control" value="${currentYear?c}" min="1900" max="2099">
            </div>
            <div class="col-auto">
                <button class="btn btn-primary" type="submit" name="typ" value="easter">Velikonoce</button>
            </div>
            <div class="col-auto">
                <button class="btn btn-primary" type="submit" name="typ" value="pentecost">Letnice</button>
            </div>
            <div class="col-auto">
                <button class="btn btn-primary" type="submit" name="typ" value="christmas">Vánoce</button>
            </div>
            <div class="col-auto">
                <button class="btn btn-primary" type="submit" name="typ" value="sylvester">Silvestr</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/1.11.8/semantic.min.css" />
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/1.11.8/semantic.min.js"></script>
    <title>Login Page</title>
</head>

<body>
    <font color=red>${errorMessage}</font>
    <div className="ui container" style=margin:20px>
        <form className="ui form" method="POST">
            <div className="field">
                <label>Username: </label>
                <input type="text" name="userName" placeholder="Username">
            </div>
            <div className="field">
                <label>Password: </label>
                <input type="password" name="password" placeholder="Password"
                    style=margin-left:3px>
            </div>
            <button className="ui button" type="submit">Submit</button>
        </form>
    </div>
</body>

</html>

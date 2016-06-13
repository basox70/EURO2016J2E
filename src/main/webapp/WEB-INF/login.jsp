<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/css/materialize.min.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
<div class="card center">
            <div class="card-content">
              <div class="row">
                <div id="login" class="col s12">
                  <form role="form" method="post" action="login">
                    <div class="input-field">
                      <input type="email" class="input-field" id="email" name="email" />
                      <label for="email">Adresse e-mail</label>
                    </div>
                    <div class="input-field">
                      <input type="password" class="input-field" id="pwd" name="pwd" />
                      <label for="pwd">Mot de passe</label>
                    </div>
                    <p class="">
                      <input type="checkbox" id="test5" class="indigo darken-3" />
                      <label for="test5">Se souvenir de moi</label>
                    </p>
                    <button type="submit" class="center indigo darken-3 btn waves-effect waves-light">Connexion</button>
                  </form>
                </div>
                </div>
                </div>
                </div>
    <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/js/materialize.min.js"></script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
    <head>
        <!--Import Google Icon Font-->
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/css/materialize.min.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
    <!--Let browser know website is optimized for mobile-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta name="theme-color" content="#5c6bc0" >
    <meta charset="UTF-8">
  </head>
  <body>
    <ul id="dropdown1" class="dropdown-content">
      <li><a href="#!">one</a></li>
      <li><a href="#!">two</a></li>
      <li class="divider"></li>
      <li><a href="#!">three</a></li>
    </ul>
    <div class="navbar-fixed">
      <nav class="indigo lighten-1 z-depth-2">
        <div class="nav-wrapper">
          <a href="#!" class="brand-logo hide-on-med-and-down"><img width="20%" src="logo.png" /></a>
          <a href="#!" class="brand-logo center">Abltx EuroBet2016<%= request.getAttribute("test") %></a>
          <a href="#" data-activates="mobile-demo" class="button-collapse"><i class="material-icons">menu</i></a>
          <ul class="right hide-on-med-and-down">
            <li><a class="dropdown-button" href="#!" data-activates="dropdown1"><i class="material-icons left">grade</i><span class="new badge">4</span></a></li>
          </ul>
          <ul class="side-nav" id="mobile-demo">
            <li><a href="sass.html">Notifications <span class="new badge">4</span></a></li>
          </ul>
        </div>
      </nav>
    </div>
    <div class="container">
      <div class="row" style="margin-top: 20px;">
        <div class="col s12 l8">
          <div class="card">
            <div class="card-content">
              <span class="card-title">Prochains matchs</span>
              <ul class="collection">
                <li class="collection-item avatar">
                  <i class="material-icons circle">schedule</i>
                  <span class="title">France - Allemagne</span>
                  <p>
                    10 Juin 2016
                  </p>
                  <a class="secondary-content modal-trigger waves-effect waves-light indigo-text" href="#modal1"><i class="material-icons">games</i></a>
                </li>
                <li class="collection-item avatar">
                  <i class="material-icons circle">schedule</i>
                  <span class="title">Angleterre - Pays-Bas</span>
                  <p>
                    12 Juin 2016
                  </p>
                  <a href="#!" class="secondary-content indigo-text"><i class="material-icons">games</i></a>
                </li>
                <li class="collection-item avatar">
                  <i class="material-icons circle green">schedule</i>
                  <span class="title">Allemagne - Pays-Bas</span>
                  <p>
                    13 Juin 2016
                  </p>
                  <a href="#!" class="secondary-content indigo-text"><i class="material-icons">games</i></a>
                </li>
                <li class="collection-item avatar">
                  <i class="material-icons circle red">schedule</i>
                  <span class="title">Angleterre - Allemagne</span>
                  <p>
                    14 Juin 2016
                  </p>
                  <a href="#!" class="secondary-content indigo-text"><i class="material-icons">games</i></a>
                </li>
              </ul>                                                                          
            </div>
            <div class="card-action">
              <a href="#">Voir tous les matchs</a>
            </div>
          </div>
        </div>
        <div class="col s12 m12 l4">
        <c:if test="${empty sessionScope.email}">
          <div class="row tabs-row">
            <ul class="tabs z-depth-1">
              <li class="tab col s6"><a href="#login">Se connecter</a></li>
              <li class="tab col s6"><a <c:if test="${!empty sessionScope.error}">class="active"</c:if> href="#register">S'inscrire</a></li>
            </ul>
          </div>
          <div class="card center">
            <div class="card-content">
              <div class="row">
                <div id="login" class="col s12">
                <c:if test="${!empty sessionScope.errorLogin}">
                    <div class="card center orange accent-1">
            			<div class="card-content">
            				<span class="white-text">${sessionScope.errorLogin}</span>
            			</div>
            		</div>    
            	</c:if>     
            	<c:remove var="errorLogin" scope="session" />                
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
                      <input type="checkbox" id="remember" class="indigo darken-3" name="remember" />
                      <label for="test5">Se souvenir de moi</label>
                    </p>
                    <button type="submit" class="center indigo darken-3 btn waves-effect waves-light">Connexion</button>
                  </form>
                </div>
                <div id="register" class="col s12">
                <c:if test="${!empty sessionScope.error}">
                    <div class="card center orange accent-1">
            			<div class="card-content">
            				<span class="white-text">${sessionScope.error}</span>
            			</div>
            		</div>    
            	</c:if>   
            	<c:remove var="error" scope="session" />          
                  <form role="form" method="post" action="signup">
                    <div class="input-field">
                      <input type="email" class="form-control" id="email_r" name="email">
                      <label class="control-label" for="email_r">Adresse e-mail</label>
                    </div>
                    <div class="input-field">
                      <input type="password" class="form-control" id="pwd_r" name="pwd">
                      <label class="control-label" for="pwd_r">Mot de passe</label>
                    </div>
                    <div class="input-field">
                      <input type="password" class="form-control" id="pwd_conf_r" name="pwd_conf">
                      <label class="control-label" for="pwd_conf_r">Confirmez le mot de passe</label>
                    </div>
                    <p class="">
                      <input type="checkbox" id="test4" class="indigo darken-3" />
                      <label for="test4">Se souvenir de moi</label>
                    </p>
                    <button type="submit" class="center indigo darken-3 btn waves-effect waves-light">Inscription</button>
                  </form>
                </div>
              </div>
            </div>
          </div>
          </c:if>
          <c:if test="${!empty sessionScope.email}">
        <div class="card center">
            <div class="card-content">
              <div class="row">
                <div id="login" class="col s12">
                    <%-- Si l'utilisateur existe en session, alors on affiche son adresse email. --%>
                    <p class="succes">Vous êtes connecté(e) avec l'adresse : ${sessionScope.email}
                    <br /><a href="./logout">Déconnexion</a></p>
                </div>
                </div>
                </div>
                </div>
        </c:if>
        </div>
        <div class="container">
            <div class="row" style="margin-top: 20px;">
                <div class="col s12 l8">
                    <div class="card">
                        <div class="card-content">
                            <span class="card-title">Prochains matchs</span>
                            <ul class="collection">
                                <c:forEach var="event" items="${events}">
                                    <li class="collection-item avatar">
                                        <i class="material-icons circle">${event.getName()}</i>
                                        <span class="title">${event.getTeam1().getName()} - ${event.getTeam2().getName()}</span>
                                        <p>
                                            ${dateFormat.format(event.getEventDate())} h
                                        </p>
                                        <c:if test="${!empty sessionScope.email}">
                                            <a class="secondary-content modal-trigger waves-effect waves-light indigo-text" href="#modal1"><i class="material-icons">games</i></a>
                                        </c:if>
                                    </li>
                                </c:forEach>
                                <!--<li class="collection-item avatar">
                                  <i class="material-icons circle">schedule</i>
                                  <span class="title">Angleterre - Pays-Bas</span>
                                  <p>
                                    12 Juin 2016
                                  </p>
                                  <a href="#!" class="secondary-content indigo-text"><i class="material-icons">games</i></a>
                                </li>
                                <li class="collection-item avatar">
                                  <i class="material-icons circle green">schedule</i>
                                  <span class="title">Allemagne - Pays-Bas</span>
                                  <p>
                                    13 Juin 2016
                                  </p>
                                  <a href="#!" class="secondary-content indigo-text"><i class="material-icons">games</i></a>
                                </li>
                                <li class="collection-item avatar">
                                  <i class="material-icons circle red">schedule</i>
                                  <span class="title">Angleterre - Allemagne</span>
                                  <p>
                                    14 Juin 2016
                                  </p>
                                  <a href="#!" class="secondary-content indigo-text"><i class="material-icons">games</i></a>
                                </li>-->
                            </ul>                                                                          
                        </div>
                        <div class="card-action">
                            <a href="#">Voir tous les matchs</a>
                        </div>
                    </div>
                </div>
                <div class="col s12 m12 l4">
                    <c:if test="${empty sessionScope.email}">
                        <div class="row tabs-row">
                            <ul class="tabs z-depth-1">
                                <li class="tab col s6"><a href="#login">Se connecter</a></li>
                                <li class="tab col s6"><a <c:if test="${!empty sessionScope.error}">class="active"</c:if> href="#register">S'inscrire</a></li>
                                </ul>
                            </div>
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
                                                    <input type="checkbox" id="remember" class="indigo darken-3" name="remember" />
                                                    <label for="test5">Se souvenir de moi</label>
                                                </p>
                                                <button type="submit" class="center indigo darken-3 btn waves-effect waves-light">Connexion</button>
                                            </form>
                                        </div>
                                        <div id="register" class="col s12">
                                        <c:if test="${!empty sessionScope.error}">
                                            <div class="card center">
                                                <div class="card-content">
                                                    <span class="red-text">${sessionScope.error}</span>
                                                </div>
                                            </div>    
                                        </c:if>   
                                        <c:remove var="error" scope="session" />          
                                        <form role="form" method="post" action="signup">
                                            <div class="input-field">
                                                <input type="email" class="form-control" id="email_r" name="email">
                                                <label class="control-label" for="email_r">Adresse e-mail</label>
                                            </div>
                                            <div class="input-field">
                                                <input type="password" class="form-control" id="pwd_r" name="pwd">
                                                <label class="control-label" for="pwd_r">Mot de passe</label>
                                            </div>
                                            <div class="input-field">
                                                <input type="password" class="form-control" id="pwd_conf_r" name="pwd_conf">
                                                <label class="control-label" for="pwd_conf_r">Confirmez le mot de passe</label>
                                            </div>
                                            <p class="">
                                                <input type="checkbox" id="test4" class="indigo darken-3" />
                                                <label for="test4">Se souvenir de moi</label>
                                            </p>
                                            <button type="submit" class="center indigo darken-3 btn waves-effect waves-light">Inscription</button>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:if>
                    <c:if test="${!empty sessionScope.email}">
                        <div class="card center">
                            <div class="card-content">
                                <div class="row">
                                    <div id="login" class="col s12">
                                        <%-- Si l'utilisateur existe en session, alors on affiche son adresse email. --%>
                                        <p class="succes">Vous êtes connecté(e) avec l'adresse : ${sessionScope.email}
                                            <br /><a href="./logout">Déconnexion</a></p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:if>
                </div>

            </div>
            <div class="row">
                <div class="parallax-container">
                    <div class="parallax"><img src="para.jpg"></div>
                </div>
            </div>

            <div class="row">
                <div class="col s12 m6 l4">
                    <div class="card">
                        <div class="card-image">
                            <img src="1ermatch.jpg">
                        </div>
                        <div class="card-content">
                            <span class="card-title">Ne ratez pas le premier match</span>
                        </div>
                        <div class="card-action">
                            <a href="#">Pronostiquer sur ce match</a>
                        </div>
                    </div>
                </div>
                <div class="col s12 m6 l4">
                    <div class="card">
                        <div class="card-content">
                            <span class="card-title">Abltx EuroBet 2016</span>
                            <p class="grey-text">Le site de pronostics pour l'Euro 2016. Ce site est réalisé dans le cadre d'un projet de JEE. <br />Nous sommes 5 étudiants de 3ème année à l'EPSI d'Arras.</p>
                        </div>
                    </div>
                </div>
                <div class="col s12 m6 l4">
                    <div class="card">
                        <div class="card-image">
                            <div class="video-container">
                                <iframe width="560" height="315" src="https://www.youtube.com/embed/2QhyuyyJCHU?rel=0&amp;showinfo=0" frameborder="0" allowfullscreen></iframe>
                            </div>
                        </div>
                        <div class="card-content">
                            <span class="card-title">Classement des joueurs</span>
                            <p class="grey-text"></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <footer class="page-footer red darken-3">
            <div class="container">
                <div class="row">
                    <div class="col l6 s12">
                        <h5 class="white-text">Site développé par</h5>
                        <div class="chip">
                            <img src="alexy.jpg" alt="Contact Person">
                            Alexy Duquesnoy
                        </div>
                        <div class="chip">
                            <img src="basile.jpg" alt="Contact Person">
                            Basile Dubruque
                        </div>
                        <div class="chip">
                            <img src="louis.jpg" alt="Contact Person">
                            Louis Dupont
                        </div>
                        <div class="chip">
                            <img src="thomas.jpg" alt="Contact Person">
                            Thomas Fournet
                        </div>
                        <div class="chip">
                            <img src="xavier.jpg" alt="Contact Person">
                            Xavier Cobigo
                        </div>
                    </div>
                    <div class="col l2 offset-l4 s12">
                        <h5 class="white-text">Liens</h5>
                        <ul>
                            <li><a class="grey-text text-lighten-3" href="http://materializecss.com/">Materialize</a></li>
                            <li><a class="grey-text text-lighten-3" href="http://stackoverflow.com/">Stack Overflow</a></li>
                            <li><a class="grey-text text-lighten-3" href="http://www.epsi.fr/">EPSI</a></li>
                            <li><a class="grey-text text-lighten-3" href="http://www.micropole.com/">Micropole</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="footer-copyright">
                <div class="container">
                    © 2016 ABLTX
                    <a class="grey-text text-lighten-4 right" href="#!">More Links</a>
                </div>
            </div>
        </footer>
        <div id="modal1" class="modal bottom-sheet">
            <div class="modal-content center indigo indigo-darken-2 white-text">
                <div class="row">
                    <div class="col s12 m12 l2 center">
                        <img src="flags/48/France.png" class="flag" alt="France" />
                    </div>
                    <div class="col s12 l8 center">
                        <h4>France - Allemagne</h4>
                        <p>10 Juin 2016</p>
                    </div>
                    <div class="col s12 m12 l2 center">
                        <img src="flags/48/Germany.png" class="flag" alt="Allemagne" />
                    </div>
                </div>

            </div>
            <div class="modal-content">
                <div class="row">
                    <div class="col s12 m4 l4 center">
                        <a class="waves-effect indigo waves-indigo btn" href="#">Victoire France</a>
                        <p>(3.66)</p>
                    </div>
                    <div class="col s12 m4 l4 center">
                        <a class="waves-effect white waves-white btn black-text" href="#">Match nul</a>
                        <p>(1.58)</p>
                    </div>
                    <div class="col s12 m4 l4 center">
                        <a class="waves-effect indigo waves-indigo btn" href="#">Victoire Allemagne</a>
                        <p>(1.04)</p>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <a href="#!" class=" modal-action modal-close waves-effect waves-green btn-flat">Fermer</a>
            </div>
        </div>

        <!--Import jQuery before materialize.js-->
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/js/materialize.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                $(".button-collapse").sideNav();
                $('ul.tabs').tabs();
                $('.parallax').parallax();
                $('.modal-trigger').leanModal();

            });
        </script>
    </body>
</html>

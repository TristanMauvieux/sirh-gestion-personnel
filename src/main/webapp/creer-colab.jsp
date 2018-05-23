<%@page language="java" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">

    <title></title>
  </head>
  <body>
        <nav class="navbar navbar-expand navbar-dark bg-dark">
                <a class="navbar-brand" href="#">LOG</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample02" aria-controls="navbarsExample02" aria-expanded="false" aria-label="Toggle navigation">
                  <span class="navbar-toggler-icon"></span>
                </button>
          
                <div class="collapse navbar-collapse" id="navbarsExample02">
                  <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                      <a class="nav-link" href="#">Collaborateurs <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="#">Statistiques</a>
                    </li>
                    <li class="nav-item">
                            <a class="nav-link" href="#">ActivitÃ©s</a>
                     </li>
                  </ul>
                </div>
       </nav>

       <div class="container">
           <div class="row">
               <div class="col">
                   <h1>Nouveau Collaborateur</h1>
               </div>
           </div>
           <form method="post">
                <div class="form-group row">
                  <label for="nomUser" class="col-sm-2 col-form-label">Nom</label>
                  <div class="col-sm-10">
                    <input type="text" required class="form-control" id="nomUser" name="nomUser" placeholder="Votre nom">
                    <span id='errorMsg'></span><br>
                  </div>
                </div>
                <div class="form-group row">
                        <label for="prenomUser" class="col-sm-2 col-form-label">Prenom</label>
                        <div class="col-sm-10">
                          <input type="text" required class="form-control" id="prenomUser" name="prenomUser" placeholder="Votre prenom">
                 </div>
                </div>
                <div class="form-group row">
                        <label class="col-sm-2 col-form-label">Date de Naissance</label>
                       <div class="col-sm-10">
							<input type="date" required class="form-control" id="dateUser" name="dateUser">
                           
                       </div>
                </div>       
                <div class="form-group row">
                        <label for="adresseUser" class="col-sm-2 col-form-label">Adresse</label>
                       <div class="col-sm-10">
                            <textarea class="form-control" required id="adresseUser" name="adresseUser" aria-label="With textarea"></textarea>
                       </div>
                 </div>  
                 <div class="form-group row">
                       <label for="numbSecSocUser" class="col-sm-2 col-form-label">Numero de sÃ©curitÃ© social</label>
                      <div class="col-sm-10">
                            <input type="text" required class="form-control" id="numbSecSocUser" name="numbSecSocUser" placeholder="Votre Numero de sÃ©curitÃ© social">
                      </div>
                </div> 
                <div class="row justify-content-end">
                        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modalNewUser" onclick="modalComplete()">CrÃ©er</button>
                </div>
 
             

              <div class="modal fade" id="modalNewUser" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
                    <div class="modal-dialog modal-dialog-centered" role="document">
                      <div class="modal-content">
                        <div class="modal-header">
                          <h5 class="modal-title" id="exampleModalCenterTitle">CrÃ©ation d'un collaborateur</h5>
                          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                          </button>
                        </div>
                        <div class="modal-body">
                                <ul class="list-group">
                                        <li class="list-group-item">Nom: <label id="nom"></label></li>
                                        <li class="list-group-item">Prenom: <label id="prenom"></label></li>
                                        <li class="list-group-item">Date de naissance: <label id="dateDeNaissance">**/**/****</label></li>
                                        <li class="list-group-item">adresse: <label id="adresse"></label></li>
                                        <li class="list-group-item">Numero de sÃ©curitÃ© social: <label id="secu"></label></li>
                                      </ul>
                        </div>
                        <div class="modal-footer">
                          <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                          <button type="submit" class="btn btn-primary">Save changes</button>
                        </div>
                      </div>
                    </div>
                  </div>
                </form>
       </div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
  <!--  <script>
            var formValid = document.getElementById('bouton_envoi');
            var prenom = document.getElementById('nomUser');
            var missPrenom = document.getElementById('errorMsg');
            
            //formValid.addEventListener('click', validation);
            /*
            function modalComplete(){
                var nom = document.getElementById("nomUser").textContent;
                var prenom = document.getElementById("prenomUser").textContent;
                var adresse = document.getElementById("adresseUser").textContent;
                var secu = document.getElementById("numbSecSocUser").textContent;

                //var modalNom = document.getElementById("nom").appendChild

                if(nom.trim() !="" & prenom.trim() !="" & adresse.trim() !="" & secu.trim() !=""){
                    
                    var texte =  document.createTextNode(nom);
                     document.getElementById("nom").appendChild(texte);
                     
                }
            }

          */

                function testError()
                {
                    var test = window.location.search;
                    if(test == "?errors"){
                        messageError();
                    }
                    alert("error");
                }

                function messageError() {
                    alert("messageError")
                    var inputs = document.querySelectorAll("input");
                    for(var i=0; i<inputs.length; i++){
                        inputs[i].className="form-control is-invalid";
                        var message = document.createElement("div");
                        message.className = "invalid-feedback";
                        champ = input[i].id;
                        message.textContent = "Le champ "+champ+" est obligatoire";
                        inputs[i].insertAdjacentElement("afertend",message);
                    }
                }
             testError();
            
    </script>
--> 

</body>
</html>
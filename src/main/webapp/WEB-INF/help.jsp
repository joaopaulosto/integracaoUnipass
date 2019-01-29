<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>Login Unipass Novamed</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
<link rel="icon" type="image/png" href="images/icons/favicon.ico" />
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="css/util.css">
<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
</head>
<body>

	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100 p-b-20" style="width: 450px;">
				<span class=""> 					 					
					<img src="images/bradescosaude.png"/>
				</span>

				<div id="accordion">
					<div class="card">
						<div class="card-header" id="headingOne">
							<h5 class="mb-0">
								<button class="btn btn-link" data-toggle="collapse"
									data-target="#collapseOne" aria-expanded="false"
									aria-controls="collapseOne">Primeiro acesso
								</button>
							</h5>
						</div>

						<div id="collapseOne" class="collapse show"
							aria-labelledby="headingOne" data-parent="#accordion">
							<div class="card-body">	
							Para acessar o sistema pela primeira vez, será necessário realizar o registro do Seu token.</br>
							Preecha as informações abaixo:							
							
							<form:form method="POST" class="login100-form validate-form" action="/unipass-login/registerUnipass?ticket=${param.ticket}" modelAttribute="unipassForm">										
														
								<div class="wrap-input100 validate-input m-t-35 m-b-35" data-validate = "Informe seu usuário">
									<input class="input100 ${not empty unipassForm.userName ? 'has-val' : ''}" type="text" name="userName" value="${unipassForm.userName}" />					
									<span class="focus-input100" data-placeholder="Seu usuário"></span>
								</div>		
								<div class="m-t-15 m-b-15">
									<form:errors path="userName" htmlEscape="false" cssClass="text-color-brad-seg" />						
								</div>						
								<div class="wrap-input100 validate-input m-t-35 m-b-35" data-validate = "Informe a frase Unipass">
									<input class="input100 ${not empty unipassForm.unipass ? 'has-val' : ''}" type="text" name="unipass" value="${unipassForm.unipass}" />					
									<span class="focus-input100" data-placeholder="Frase Domínio NovaMed"></span>
								</div>													
								<div class="m-t-15 m-b-15">
<%-- 									<form:errors path="unipass" htmlEscape="false" cssClass="text-color-brad-seg" />	 --%>
									<form:errors path="unipass" htmlEscape="false" cssStyle="color: #CC092F" />					
								</div>														
								<div class="container-login100-form-btn">
									<button class="login100-form-btn">
										Cadastrar
									</button>
								</div>					
							</form:form>							
								
								
							</div>
						</div>
					</div>
					<div class="card">
						<div class="card-header" id="headingTwo">
							<h5 class="mb-0">
								<button class="btn btn-link collapsed" data-toggle="collapse"
									data-target="#collapseTwo" aria-expanded="false"
									aria-controls="collapseTwo">Já tenho acesso
								</button>
							</h5>
						</div>
						<div id="collapseTwo" class="collapse"
							aria-labelledby="headingTwo" data-parent="#accordion">
							<div class="card-body">
							Realize a sincronização através do site na opção Sincronizar token</br>
							Caso o problema persista, procure o suporte técnico.
							</br></br>
							<a href="https://unipass.bradesco.com.br" target="_blank">Unipass DITI</a>
							</div>
						</div>
					</div>
					<ul class="login-more p-t-30">
<%-- 						 <a href="/unipass-login/help?ticket=${unipassForm.ticket}" class="txt2">Estou com problemas</a>												 --%>
						 <a href="/unipass-login/index?ticket=${param.ticket}" class="txt2">Voltar</a>																		 
					</ul>					
				</div>

			</div>
		</div>
	</div>

	<div id="dropDownSelect1"></div>

	<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/animsition/js/animsition.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/countdowntime/countdowntime.js"></script>
	<!--===============================================================================================-->
	<script src="js/main.js"></script>


</body>
</html>
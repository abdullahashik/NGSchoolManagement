<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Limitless - Responsive Web Application Kit by Eugene
	Kopyov</title>

<!-- Global stylesheets -->
<link
	href="https://fonts.googleapis.com/css?family=Roboto:400,300,100,500,700,900"
	rel="stylesheet" type="text/css">
<link href="resources/assets/css/icons/icomoon/styles.css"
	rel="stylesheet" type="text/css">
<link href="resources/assets/css/bootstrap.css" rel="stylesheet"
	type="text/css">
<link href="resources/assets/css/core.css" rel="stylesheet"
	type="text/css">
<link href="resources/assets/css/components.css" rel="stylesheet"
	type="text/css">
<link href="resources/assets/css/colors.css" rel="stylesheet"
	type="text/css">
<!-- /global stylesheets -->

<!-- Core JS files -->
<script type="text/javascript"
	src="resources/assets/js/plugins/loaders/pace.min.js"></script>
<script type="text/javascript"
	src="resources/assets/js/core/libraries/jquery.min.js"></script>
<script type="text/javascript"
	src="resources/assets/js/core/libraries/bootstrap.min.js"></script>
<script type="text/javascript"
	src="resources/assets/js/plugins/loaders/blockui.min.js"></script>
<!-- /core JS files -->

<!-- Theme JS files -->
<script type="text/javascript" src="resources/ckeditor/ckeditor.js"></script>
<script type="text/javascript"
	src="resources/assets/js/plugins/forms/selects/select2.min.js"></script>

<script type="text/javascript" src="resources/assets/js/core/app.js"></script>
<script type="text/javascript"
	src="resources/assets/js/pages/editor_ckeditor.js"></script>

<script type="text/javascript"
	src="resources/assets/js/plugins/ui/ripple.min.js"></script>
<!-- /theme JS files -->

</head>

<body>

	<!-- Main navbar -->
	<div class="navbar navbar-inverse bg-indigo">
		<div class="navbar-header">
			<a class="navbar-brand" href="index.html"><img
				src="resources/assets/images/logo_light.png" alt=""></a>

			<ul class="nav navbar-nav visible-xs-block">
				<li><a data-toggle="collapse" data-target="#navbar-mobile"><i
						class="icon-tree5"></i></a></li>
				<li><a class="sidebar-mobile-main-toggle"><i
						class="icon-paragraph-justify3"></i></a></li>
			</ul>
		</div>

		<div class="navbar-collapse collapse" id="navbar-mobile">
			<ul class="nav navbar-nav">
				<li><a class="sidebar-control sidebar-main-toggle hidden-xs"><i
						class="icon-paragraph-justify3"></i></a></li>

				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"> <i class="icon-puzzle3"></i> <span
						class="visible-xs-inline-block position-right">Git updates</span>
						<span class="status-mark border-orange-400"></span>
				</a>

					<div class="dropdown-menu dropdown-content">
						<div class="dropdown-content-heading">
							Git updates
							<ul class="icons-list">
								<li><a href="#"><i class="icon-sync"></i></a></li>
							</ul>
						</div>

						<ul class="media-list dropdown-content-body width-350">
							<li class="media">
								<div class="media-left">
									<a href="#"
										class="btn border-primary text-primary btn-flat btn-rounded btn-icon btn-sm"><i
										class="icon-git-pull-request"></i></a>
								</div>

								<div class="media-body">
									Drop the IE <a href="#">specific hacks</a> for temporal inputs
									<div class="media-annotation">4 minutes ago</div>
								</div>
							</li>

							<li class="media">
								<div class="media-left">
									<a href="#"
										class="btn border-warning text-warning btn-flat btn-rounded btn-icon btn-sm"><i
										class="icon-git-commit"></i></a>
								</div>

								<div class="media-body">
									Add full font overrides for popovers and tooltips
									<div class="media-annotation">36 minutes ago</div>
								</div>
							</li>

							<li class="media">
								<div class="media-left">
									<a href="#"
										class="btn border-info text-info btn-flat btn-rounded btn-icon btn-sm"><i
										class="icon-git-branch"></i></a>
								</div>

								<div class="media-body">
									<a href="#">Chris Arney</a> created a new <span
										class="text-semibold">Design</span> branch
									<div class="media-annotation">2 hours ago</div>
								</div>
							</li>

							<li class="media">
								<div class="media-left">
									<a href="#"
										class="btn border-success text-success btn-flat btn-rounded btn-icon btn-sm"><i
										class="icon-git-merge"></i></a>
								</div>

								<div class="media-body">
									<a href="#">Eugene Kopyov</a> merged <span
										class="text-semibold">Master</span> and <span
										class="text-semibold">Dev</span> branches
									<div class="media-annotation">Dec 18, 18:36</div>
								</div>
							</li>

							<li class="media">
								<div class="media-left">
									<a href="#"
										class="btn border-primary text-primary btn-flat btn-rounded btn-icon btn-sm"><i
										class="icon-git-pull-request"></i></a>
								</div>

								<div class="media-body">
									Have Carousel ignore keyboard events
									<div class="media-annotation">Dec 12, 05:46</div>
								</div>
							</li>
						</ul>

						<div class="dropdown-content-footer">
							<a href="#" data-popup="tooltip" title="All activity"><i
								class="icon-menu display-block"></i></a>
						</div>
					</div></li>
			</ul>

			<div class="navbar-right">
				<p class="navbar-text">Morning, Victoria!</p>
				<p class="navbar-text">
					<span class="label bg-success-400">Online</span>
				</p>

				<ul class="nav navbar-nav">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"> <i class="icon-bell2"></i> <span
							class="visible-xs-inline-block position-right">Activity</span> <span
							class="status-mark border-orange-400"></span>
					</a>

						<div class="dropdown-menu dropdown-content">
							<div class="dropdown-content-heading">
								Activity
								<ul class="icons-list">
									<li><a href="#"><i class="icon-menu7"></i></a></li>
								</ul>
							</div>

							<ul class="media-list dropdown-content-body width-350">
								<li class="media">
									<div class="media-left">
										<a href="#"
											class="btn bg-success-400 btn-rounded btn-icon btn-xs"><i
											class="icon-mention"></i></a>
									</div>

									<div class="media-body">
										<a href="#">Taylor Swift</a> mentioned you in a post "Angular
										JS. Tips and tricks"
										<div class="media-annotation">4 minutes ago</div>
									</div>
								</li>

								<li class="media">
									<div class="media-left">
										<a href="#"
											class="btn bg-pink-400 btn-rounded btn-icon btn-xs"><i
											class="icon-paperplane"></i></a>
									</div>

									<div class="media-body">
										Special offers have been sent to subscribed users by <a
											href="#">Donna Gordon</a>
										<div class="media-annotation">36 minutes ago</div>
									</div>
								</li>

								<li class="media">
									<div class="media-left">
										<a href="#" class="btn bg-blue btn-rounded btn-icon btn-xs"><i
											class="icon-plus3"></i></a>
									</div>

									<div class="media-body">
										<a href="#">Chris Arney</a> created a new <span
											class="text-semibold">Design</span> branch in <span
											class="text-semibold">Limitless</span> repository
										<div class="media-annotation">2 hours ago</div>
									</div>
								</li>

								<li class="media">
									<div class="media-left">
										<a href="#"
											class="btn bg-purple-300 btn-rounded btn-icon btn-xs"><i
											class="icon-truck"></i></a>
									</div>

									<div class="media-body">
										Shipping cost to the Netherlands has been reduced, database
										updated
										<div class="media-annotation">Feb 8, 11:30</div>
									</div>
								</li>

								<li class="media">
									<div class="media-left">
										<a href="#"
											class="btn bg-warning-400 btn-rounded btn-icon btn-xs"><i
											class="icon-bubble8"></i></a>
									</div>

									<div class="media-body">
										New review received on <a href="#">Server side integration</a>
										services
										<div class="media-annotation">Feb 2, 10:20</div>
									</div>
								</li>

								<li class="media">
									<div class="media-left">
										<a href="#"
											class="btn bg-teal-400 btn-rounded btn-icon btn-xs"><i
											class="icon-spinner11"></i></a>
									</div>

									<div class="media-body">
										<strong>January, 2016</strong> - 1320 new users, 3284 orders,
										$49,390 revenue
										<div class="media-annotation">Feb 1, 05:46</div>
									</div>
								</li>
							</ul>
						</div></li>

					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"> <i class="icon-bubble8"></i> <span
							class="visible-xs-inline-block position-right">Messages</span> <span
							class="status-mark border-orange-400"></span>
					</a>

						<div class="dropdown-menu dropdown-content width-350">
							<div class="dropdown-content-heading">
								Messages
								<ul class="icons-list">
									<li><a href="#"><i class="icon-compose"></i></a></li>
								</ul>
							</div>

							<ul class="media-list dropdown-content-body">
								<li class="media">
									<div class="media-left">
										<img src="assets/images/placeholder.jpg"
											class="img-circle img-sm" alt=""> <span
											class="badge bg-danger-400 media-badge">5</span>
									</div>

									<div class="media-body">
										<a href="#" class="media-heading"> <span
											class="text-semibold">James Alexander</span> <span
											class="media-annotation pull-right">04:58</span>
										</a> <span class="text-muted">who knows, maybe that would
											be the best thing for me...</span>
									</div>
								</li>

								<li class="media">
									<div class="media-left">
										<img src="assets/images/placeholder.jpg"
											class="img-circle img-sm" alt=""> <span
											class="badge bg-danger-400 media-badge">4</span>
									</div>

									<div class="media-body">
										<a href="#" class="media-heading"> <span
											class="text-semibold">Margo Baker</span> <span
											class="media-annotation pull-right">12:16</span>
										</a> <span class="text-muted">That was something he was
											unable to do because...</span>
									</div>
								</li>

								<li class="media">
									<div class="media-left">
										<img src="assets/images/placeholder.jpg"
											class="img-circle img-sm" alt="">
									</div>
									<div class="media-body">
										<a href="#" class="media-heading"> <span
											class="text-semibold">Jeremy Victorino</span> <span
											class="media-annotation pull-right">22:48</span>
										</a> <span class="text-muted">But that would be extremely
											strained and suspicious...</span>
									</div>
								</li>

								<li class="media">
									<div class="media-left">
										<img src="assets/images/placeholder.jpg"
											class="img-circle img-sm" alt="">
									</div>
									<div class="media-body">
										<a href="#" class="media-heading"> <span
											class="text-semibold">Beatrix Diaz</span> <span
											class="media-annotation pull-right">Tue</span>
										</a> <span class="text-muted">What a strenuous career it is
											that I've chosen...</span>
									</div>
								</li>

								<li class="media">
									<div class="media-left">
										<img src="assets/images/placeholder.jpg"
											class="img-circle img-sm" alt="">
									</div>
									<div class="media-body">
										<a href="#" class="media-heading"> <span
											class="text-semibold">Richard Vango</span> <span
											class="media-annotation pull-right">Mon</span>
										</a> <span class="text-muted">Other travelling salesmen
											live a life of luxury...</span>
									</div>
								</li>
							</ul>

							<div class="dropdown-content-footer">
								<a href="#" data-popup="tooltip" title="All messages"><i
									class="icon-menu display-block"></i></a>
							</div>
						</div></li>
				</ul>
			</div>
		</div>
	</div>
	<!-- /main navbar -->


	<!-- Page container -->
	<div class="page-container">

		<!-- Page content -->
		<div class="page-content">

			<!-- Main sidebar -->
			<div class="sidebar sidebar-main sidebar-default">
				<div class="sidebar-content">

					<!-- User menu -->
					<div class="sidebar-user-material">
						<div class="category-content">
							<div class="sidebar-user-material-content">
								<a href="#"><img
									src="resources/assets/images/placeholder.jpg"
									class="img-circle img-responsive" alt=""></a>
								<h6>Victoria Baker</h6>
								<span class="text-size-small">Santa Ana, CA</span>
							</div>

							<div class="sidebar-user-material-menu">
								<a href="#user-nav" data-toggle="collapse"><span>My
										account</span> <i class="caret"></i></a>
							</div>
						</div>

						<div class="navigation-wrapper collapse" id="user-nav">
							<ul class="navigation">
								<li><a href="profile"><i class="icon-user-plus"></i> <span>My
											profile</span></a></li>
								<li><a href="balance"><i class="icon-coins"></i> <span>My
											balance</span></a></li>
								<li><a href="#">

										<li class="divider"></li>
										<li><a href="#"><i class="icon-cog5"></i> <span>Account
													settings</span></a></li>
										<li><a href="logout"><i class="icon-switch2"></i> <span>Logout</span></a></li>
							</ul>
						</div>
					</div>
					<!-- /user menu -->


					<!-- Main navigation -->
					<%@ include file="/WEB-INF/views/include/menu.jsp"%>
					<!-- /main navigation -->

				</div>
			</div>
			<!-- /main sidebar -->


			<!-- Main content -->
			<div class="content-wrapper">

				<!-- Page header -->
				<div class="page-header page-header-default">
					<div class="page-header-content">
						<div class="page-title">
							<h4>
								<i class="icon-arrow-left52 position-left"></i> <span
									class="text-semibold">Home</span> - Dashboard
							</h4>
						</div>

						<div class="heading-elements">
							<div class="heading-btn-group">
								<a href="#"
									class="btn btn-link btn-float text-size-small has-text"><i
									class="icon-bars-alt text-primary"></i><span>Statistics</span></a>
								<a href="#"
									class="btn btn-link btn-float text-size-small has-text"><i
									class="icon-calculator text-primary"></i> <span>Invoices</span></a>
								<a href="#"
									class="btn btn-link btn-float text-size-small has-text"><i
									class="icon-calendar5 text-primary"></i> <span>Schedule</span></a>
							</div>
						</div>
					</div>

					<div class="breadcrumb-line">
						<ul class="breadcrumb">
							<li><a href="index.html"><i
									class="icon-home2 position-left"></i> Home</a></li>
							<li class="active">Dashboard</li>
						</ul>

						<ul class="breadcrumb-elements">
							<li><a href="#"><i
									class="icon-comment-discussion position-left"></i> Support</a></li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown"> <i class="icon-gear position-left"></i>
									Settings <span class="caret"></span>
							</a>

								<ul class="dropdown-menu dropdown-menu-right">
									<li><a href="#"><i class="icon-user-lock"></i> Account
											security</a></li>
									<li><a href="#"><i class="icon-statistics"></i>
											Analytics</a></li>
									<li><a href="#"><i class="icon-accessibility"></i>
											Accessibility</a></li>
									<li class="divider"></li>
									<li><a href="#"><i class="icon-gear"></i> All settings</a></li>
								</ul></li>
						</ul>
					</div>
				</div>
				<!-- /page header -->

				<!-- Content area -->

				<c:if test="${!empty msg }">
					<div class="alert bg-success alert-styled-right">
						<button type="button" class="close" data-dismiss="alert">
							<span>×</span><span class="sr-only">Close</span>
						</button>
						<span class="text-semibold">Well done!</span>${msg }
					</div>
				</c:if>

				<div class="content">
					<form action="students_add" method="post">
						<!-- First name default -->
						<div class="panel panel-flat">
							<div class="panel-heading">
								<h5 class="panel-title">First Name</h5>
								<div class="heading-elements">
									<ul class="icons-list">
										<li><a data-action="collapse"></a></li>
										<li><a data-action="reload"></a></li>
										<li><a data-action="close"></a></li>
									</ul>
								</div>
							</div>

							<div class="panel-body">
								<p class="content-group">Student's first name to be
									mentioned here.!</p>
								<div class="content-group">
									<input type="text" class="form-control"
										placeholder="student's first name" name="fname" />
								</div>
							</div>
						</div>
						<!-- middle name default -->
						<div class="panel panel-flat">
							<div class="panel-heading">
								<h5 class="panel-title">Middle Name</h5>
								<div class="heading-elements">
									<ul class="icons-list">
										<li><a data-action="collapse"></a></li>
										<li><a data-action="reload"></a></li>
										<li><a data-action="close"></a></li>
									</ul>
								</div>
							</div>

							<div class="panel-body">
								<p class="content-group">Student's middle name to be
									mentioned here.!</p>
								<div class="content-group">
									<input type="text" class="form-control"
										placeholder="student's middle name" name="mname" />
								</div>
							</div>
						</div>
						<!-- last name default -->
						<div class="panel panel-flat">
							<div class="panel-heading">
								<h5 class="panel-title">Last Name</h5>
								<div class="heading-elements">
									<ul class="icons-list">
										<li><a data-action="collapse"></a></li>
										<li><a data-action="reload"></a></li>
										<li><a data-action="close"></a></li>
									</ul>
								</div>
							</div>

							<div class="panel-body">
								<p class="content-group">Student's last name to be mentioned
									here.!</p>
								<div class="content-group">
									<input type="text" class="form-control"
										placeholder="student's last name" name="lname" />
								</div>
							</div>
						</div>
						<!-- Student's id default -->
						<div class="panel panel-flat">
							<div class="panel-heading">
								<h5 class="panel-title">ID Number</h5>
								<div class="heading-elements">
									<ul class="icons-list">
										<li><a data-action="collapse"></a></li>
										<li><a data-action="reload"></a></li>
										<li><a data-action="close"></a></li>
									</ul>
								</div>
							</div>

							<div class="panel-body">
								<p class="content-group">Student's id/roll to be mentioned
									here.!</p>
								<div class="content-group">
									<input type="text" class="form-control"
										placeholder="student's id/roll" name="student_id" />
								</div>
							</div>
						</div>
						<!-- Access Codes -->
						<div class="panel panel-flat">
							<div class="panel-heading">
								<h5 class="panel-title">Access Code</h5>
								<div class="heading-elements">
									<ul class="icons-list">
										<li><a data-action="collapse"></a></li>
										<li><a data-action="reload"></a></li>
										<li><a data-action="close"></a></li>
									</ul>
								</div>
							</div>

							<div class="panel-body">
								<p class="content-group">Student's access code to be
									mentioned here.!</p>
								<div class="content-group">
									<input type="text" class="form-control"
										placeholder="student's access code" name="access_code" />
								</div>
							</div>
						</div>
						<!-- Gurdian information -->
						<div class="panel panel-flat">
							<div class="panel-heading">
								<h5 class="panel-title">Gurdian</h5>
								<div class="heading-elements">
									<ul class="icons-list">
										<li><a data-action="collapse"></a></li>
										<li><a data-action="reload"></a></li>
										<li><a data-action="close"></a></li>
									</ul>
								</div>
							</div>

							<div class="panel-body">

								<!--name-->
								<div class="form-group">
									<label>Gurdian's Name</label> <input type="text"
										placeholder="gurdian's name" name="gurdian_name"
										class="form-control" />
								</div>
								<!--Email-->
								<div class="form-group">
									<label>Gurdian's Email</label> <input type="email"
										placeholder="gurdian's email" name="gurdian_email"
										class="form-control" />
								</div>
								<!--Address-->
								<div class="form-group">
									<label>Gurdian's Address</label> <input type="text"
										placeholder="gurdian's address" name="gurdian_address"
										class="form-control" />
								</div>
								<!--Phone-->
								<div class="form-group">
									<label>Gurdian Name</label> <input type="text"
										placeholder="gurdian's phone" name="gurdian_phone"
										class="form-control" />
								</div>

							</div>
						</div>
						<div class="panel panel-flat">
							<div class="panel-heading">
								<h5 class="panel-title">Present Status</h5>
								<div class="heading-elements">
									<ul class="icons-list">
										<li><a data-action="collapse"></a></li>
										<li><a data-action="reload"></a></li>
										<li><a data-action="close"></a></li>
									</ul>
								</div>
							</div>

							<div class="panel-body">
								<p class="content-group">Student's present status to be
									mentioned here.!</p>
								<div class="content-group">
									<select class="form-control" name="p_status">
										<option>---Student's Present Status---</option>
									</select>
								</div>
							</div>
						</div>
						<div class="pull-right">
							<button class="btn btn-sm btn-info">Save info</button>
						</div>
					</form>
					<!-- Footer -->
					<div class="footer text-muted">
						&copy; 2015. <a href="#">Limitless Web App Kit</a> by <a
							href="http://themeforest.net/user/Kopyov" target="_blank">Eugene
							Kopyov</a>
					</div>
					<!-- /footer -->

				</div>
				<!-- /content area -->

			</div>
			<!-- /main content -->

		</div>
		<!-- /page content -->

	</div>
	<!-- /page container -->

</body>
</html>

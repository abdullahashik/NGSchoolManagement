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
<script type="text/javascript" src="resources/assets/js/core/app.js"></script>

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
								<a href="#"><img src="assets/images/placeholder.jpg"
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
								<li><a href="#"><i class="icon-user-plus"></i> <span>My
											profile</span></a></li>
								<li><a href="#"><i class="icon-coins"></i> <span>My
											balance</span></a></li>
								<li><a href="#"><i class="icon-comment-discussion"></i>
										<span><span class="badge bg-teal-400 pull-right">58</span>
											Messages</span></a></li>
								<li class="divider"></li>
								<li><a href="#"><i class="icon-cog5"></i> <span>Account
											settings</span></a></li>
								<li><a href="#"><i class="icon-switch2"></i> <span>Logout</span></a></li>
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
				<div class="page-header">
					<div class="page-header-content">
						<div class="page-title">
							<h4>
								<i class="icon-arrow-left52 position-left"></i> <span
									class="text-semibold">Search</span> - Gurdians
							</h4>

							<ul class="breadcrumb position-right">
								<li><a href="index.html">Home</a></li>
								<li><a href="search_users.html">Gurdians</a></li>
								<li class="active">Gurdians List</li>
							</ul>
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
				</div>
				<!-- /page header -->


				<!-- Content area -->
				<div class="content">

					<!-- Search field -->
					<div class="panel panel-flat">
						<div class="panel-heading">
							<h5 class="panel-title">Gurdians</h5>
							<div class="heading-elements">
								<ul class="icons-list">
									<li><a data-action="collapse"></a></li>
									<li><a data-action="close"></a></li>
								</ul>
							</div>
						</div>

						<div class="panel-body">
							<form action="#" class="main-search">
								<div class="input-group content-group">
									<div class="has-feedback has-feedback-left">
										<input type="text" class="form-control input-xlg"
											value="Limitless interface kit">
										<div class="form-control-feedback">
											<i class="icon-search4 text-muted text-size-base"></i>
										</div>
									</div>

									<div class="input-group-btn">
										<button type="submit" class="btn btn-primary btn-xlg">Search</button>
									</div>
								</div>


								<div class="col-sm-6 text-right">
									<ul class="list-inline no-margin-bottom">
										<li><a href="#" class="btn btn-link btn-sm"><i
												class="icon-make-group position-left"></i> Gurdians</a></li>										
									</ul>
								</div>
						</div>
						</form>
					</div>
				</div>
				<!-- /search field -->

				<!-- Search results -->
				<div class="content-group">
					<c:if test="${!empty gurdians }">
						<p class="text-muted text-size-small content-group">About
							${gurdians.size() } results</p>
					</c:if>

					<div class="search-results-list">
						<div
							class="text-size-small text-uppercase text-semibold text-muted mb-10">Cards
							view</div>
						<c:if test="${!empty gurdians }">

							<div class="row">

								<c:forEach var="gurdian" items="${gurdians }">
									<div class="col-sm-4">
										<div class="panel panel-body">
											<div class="media">
												<a href="#" class="media-left"> <img
													src="resources/assets/images/placeholder.jpg"
													class="img-circle img-lg" alt="">
												</a>

												<div class="media-body">
													<h6 class="media-heading">${gurdian.getName() }</h6>
													<span class="text-muted">${gurdian.getEmail() }</span>
												</div>

												<div class="media-right media-middle">
													<ul class="icons-list">
														<li class="dropdown"><a href="#"
															class="dropdown-toggle" data-toggle="dropdown"><i
																class="icon-menu7"></i></a>
															<ul class="dropdown-menu dropdown-menu-right">
																<li><a href="#"><i
																		class="icon-comment-discussion pull-right"></i> View
																		Detail</a></li>
																<li><a href="#"><i
																		class="icon-erase pull-right"></i>Delete</a></li>
																<li><a href="#"><i
																		class="icon-pencil pull-right"></i>Edit Detail</a></li>
																<li class="divider"></li>
															</ul></li>
													</ul>
												</div>
											</div>
										</div>
									</div>
								</c:forEach>

							</div>
						</c:if>
					</div>
				</div>
				<!-- /search results -->


				<!-- Pagination -->

				<!-- /pagination -->


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

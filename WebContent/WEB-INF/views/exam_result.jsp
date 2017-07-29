<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Limitless - Responsive Web Application Kit by Eugene Kopyov</title>

	<!-- Global stylesheets -->
	<link href="https://fonts.googleapis.com/css?family=Roboto:400,300,100,500,700,900" rel="stylesheet" type="text/css">
	<link href="resources/assets/css/icons/icomoon/styles.css" rel="stylesheet" type="text/css">
	<link href="resources/assets/css/bootstrap.css" rel="stylesheet" type="text/css">
	<link href="resources/assets/css/core.css" rel="stylesheet" type="text/css">
	<link href="resources/assets/css/components.css" rel="stylesheet" type="text/css">
	<link href="resources/assets/css/colors.css" rel="stylesheet" type="text/css">
	<!-- /global stylesheets -->

	<!-- Core JS files -->
	<script type="text/javascript" src="resources/assets/js/plugins/loaders/pace.min.js"></script>
	<script type="text/javascript" src="resources/assets/js/core/libraries/jquery.min.js"></script>
	<script type="text/javascript" src="resources/assets/js/core/libraries/bootstrap.min.js"></script>
	<script type="text/javascript" src="resources/assets/js/plugins/loaders/blockui.min.js"></script>
	<!-- /core JS files -->

	<!-- Theme JS files -->
	<script type="text/javascript" src="resources/assets/js/core/app.js"></script>

	<script type="text/javascript" src="resources/assets/js/plugins/ui/ripple.min.js"></script>
	<!-- /theme JS files -->

</head>

<body>

	<!-- Main navbar -->
	<div class="navbar navbar-inverse bg-indigo">
		<div class="navbar-header">
			<a class="navbar-brand" href="index.html"><img src="resources/assets/images/logo_light.png" alt=""></a>

			<ul class="nav navbar-nav visible-xs-block">
				<li><a data-toggle="collapse" data-target="#navbar-mobile"><i class="icon-tree5"></i></a></li>
				<li><a class="sidebar-mobile-main-toggle"><i class="icon-paragraph-justify3"></i></a></li>
			</ul>
		</div>

		<div class="navbar-collapse collapse" id="navbar-mobile">
			<ul class="nav navbar-nav">
				<li><a class="sidebar-control sidebar-main-toggle hidden-xs"><i class="icon-paragraph-justify3"></i></a></li>

				<li class="dropdown">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown">
						<i class="icon-puzzle3"></i>
						<span class="visible-xs-inline-block position-right">Git updates</span>
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
									<a href="#" class="btn border-primary text-primary btn-flat btn-rounded btn-icon btn-sm"><i class="icon-git-pull-request"></i></a>
								</div>

								<div class="media-body">
									Drop the IE <a href="#">specific hacks</a> for temporal inputs
									<div class="media-annotation">4 minutes ago</div>
								</div>
							</li>

							<li class="media">
								<div class="media-left">
									<a href="#" class="btn border-warning text-warning btn-flat btn-rounded btn-icon btn-sm"><i class="icon-git-commit"></i></a>
								</div>
								
								<div class="media-body">
									Add full font overrides for popovers and tooltips
									<div class="media-annotation">36 minutes ago</div>
								</div>
							</li>

							<li class="media">
								<div class="media-left">
									<a href="#" class="btn border-info text-info btn-flat btn-rounded btn-icon btn-sm"><i class="icon-git-branch"></i></a>
								</div>
								
								<div class="media-body">
									<a href="#">Chris Arney</a> created a new <span class="text-semibold">Design</span> branch
									<div class="media-annotation">2 hours ago</div>
								</div>
							</li>

							<li class="media">
								<div class="media-left">
									<a href="#" class="btn border-success text-success btn-flat btn-rounded btn-icon btn-sm"><i class="icon-git-merge"></i></a>
								</div>
								
								<div class="media-body">
									<a href="#">Eugene Kopyov</a> merged <span class="text-semibold">Master</span> and <span class="text-semibold">Dev</span> branches
									<div class="media-annotation">Dec 18, 18:36</div>
								</div>
							</li>

							<li class="media">
								<div class="media-left">
									<a href="#" class="btn border-primary text-primary btn-flat btn-rounded btn-icon btn-sm"><i class="icon-git-pull-request"></i></a>
								</div>
								
								<div class="media-body">
									Have Carousel ignore keyboard events
									<div class="media-annotation">Dec 12, 05:46</div>
								</div>
							</li>
						</ul>

						<div class="dropdown-content-footer">
							<a href="#" data-popup="tooltip" title="All activity"><i class="icon-menu display-block"></i></a>
						</div>
					</div>
				</li>
			</ul>

			<div class="navbar-right">
				<p class="navbar-text">Morning, Victoria!</p>
				<p class="navbar-text"><span class="label bg-success-400">Online</span></p>
				
				<ul class="nav navbar-nav">				
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
							<i class="icon-bell2"></i>
							<span class="visible-xs-inline-block position-right">Activity</span>
							<span class="status-mark border-orange-400"></span>
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
										<a href="#" class="btn bg-success-400 btn-rounded btn-icon btn-xs"><i class="icon-mention"></i></a>
									</div>

									<div class="media-body">
										<a href="#">Taylor Swift</a> mentioned you in a post "Angular JS. Tips and tricks"
										<div class="media-annotation">4 minutes ago</div>
									</div>
								</li>

								<li class="media">
									<div class="media-left">
										<a href="#" class="btn bg-pink-400 btn-rounded btn-icon btn-xs"><i class="icon-paperplane"></i></a>
									</div>
									
									<div class="media-body">
										Special offers have been sent to subscribed users by <a href="#">Donna Gordon</a>
										<div class="media-annotation">36 minutes ago</div>
									</div>
								</li>

								<li class="media">
									<div class="media-left">
										<a href="#" class="btn bg-blue btn-rounded btn-icon btn-xs"><i class="icon-plus3"></i></a>
									</div>
									
									<div class="media-body">
										<a href="#">Chris Arney</a> created a new <span class="text-semibold">Design</span> branch in <span class="text-semibold">Limitless</span> repository
										<div class="media-annotation">2 hours ago</div>
									</div>
								</li>

								<li class="media">
									<div class="media-left">
										<a href="#" class="btn bg-purple-300 btn-rounded btn-icon btn-xs"><i class="icon-truck"></i></a>
									</div>
									
									<div class="media-body">
										Shipping cost to the Netherlands has been reduced, database updated
										<div class="media-annotation">Feb 8, 11:30</div>
									</div>
								</li>

								<li class="media">
									<div class="media-left">
										<a href="#" class="btn bg-warning-400 btn-rounded btn-icon btn-xs"><i class="icon-bubble8"></i></a>
									</div>
									
									<div class="media-body">
										New review received on <a href="#">Server side integration</a> services
										<div class="media-annotation">Feb 2, 10:20</div>
									</div>
								</li>

								<li class="media">
									<div class="media-left">
										<a href="#" class="btn bg-teal-400 btn-rounded btn-icon btn-xs"><i class="icon-spinner11"></i></a>
									</div>
									
									<div class="media-body">
										<strong>January, 2016</strong> - 1320 new users, 3284 orders, $49,390 revenue
										<div class="media-annotation">Feb 1, 05:46</div>
									</div>
								</li>
							</ul>
						</div>
					</li>

					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
							<i class="icon-bubble8"></i>
							<span class="visible-xs-inline-block position-right">Messages</span>
							<span class="status-mark border-orange-400"></span>
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
										<img src="assets/images/placeholder.jpg" class="img-circle img-sm" alt="">
										<span class="badge bg-danger-400 media-badge">5</span>
									</div>

									<div class="media-body">
										<a href="#" class="media-heading">
											<span class="text-semibold">James Alexander</span>
											<span class="media-annotation pull-right">04:58</span>
										</a>

										<span class="text-muted">who knows, maybe that would be the best thing for me...</span>
									</div>
								</li>

								<li class="media">
									<div class="media-left">
										<img src="assets/images/placeholder.jpg" class="img-circle img-sm" alt="">
										<span class="badge bg-danger-400 media-badge">4</span>
									</div>

									<div class="media-body">
										<a href="#" class="media-heading">
											<span class="text-semibold">Margo Baker</span>
											<span class="media-annotation pull-right">12:16</span>
										</a>

										<span class="text-muted">That was something he was unable to do because...</span>
									</div>
								</li>

								<li class="media">
									<div class="media-left"><img src="assets/images/placeholder.jpg" class="img-circle img-sm" alt=""></div>
									<div class="media-body">
										<a href="#" class="media-heading">
											<span class="text-semibold">Jeremy Victorino</span>
											<span class="media-annotation pull-right">22:48</span>
										</a>

										<span class="text-muted">But that would be extremely strained and suspicious...</span>
									</div>
								</li>

								<li class="media">
									<div class="media-left"><img src="assets/images/placeholder.jpg" class="img-circle img-sm" alt=""></div>
									<div class="media-body">
										<a href="#" class="media-heading">
											<span class="text-semibold">Beatrix Diaz</span>
											<span class="media-annotation pull-right">Tue</span>
										</a>

										<span class="text-muted">What a strenuous career it is that I've chosen...</span>
									</div>
								</li>

								<li class="media">
									<div class="media-left"><img src="assets/images/placeholder.jpg" class="img-circle img-sm" alt=""></div>
									<div class="media-body">
										<a href="#" class="media-heading">
											<span class="text-semibold">Richard Vango</span>
											<span class="media-annotation pull-right">Mon</span>
										</a>
										
										<span class="text-muted">Other travelling salesmen live a life of luxury...</span>
									</div>
								</li>
							</ul>

							<div class="dropdown-content-footer">
								<a href="#" data-popup="tooltip" title="All messages"><i class="icon-menu display-block"></i></a>
							</div>
						</div>
					</li>					
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
								<a href="#"><img src="assets/images/placeholder.jpg" class="img-circle img-responsive" alt=""></a>
								<h6>Victoria Baker</h6>
								<span class="text-size-small">Santa Ana, CA</span>
							</div>
														
							<div class="sidebar-user-material-menu">
								<a href="#user-nav" data-toggle="collapse"><span>My account</span> <i class="caret"></i></a>
							</div>
						</div>
						
						<div class="navigation-wrapper collapse" id="user-nav">
							<ul class="navigation">
								<li><a href="#"><i class="icon-user-plus"></i> <span>My profile</span></a></li>
								<li><a href="#"><i class="icon-coins"></i> <span>My balance</span></a></li>
								<li><a href="#"><i class="icon-comment-discussion"></i> <span><span class="badge bg-teal-400 pull-right">58</span> Messages</span></a></li>
								<li class="divider"></li>
								<li><a href="#"><i class="icon-cog5"></i> <span>Account settings</span></a></li>
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
				<div class="page-header page-header-default">
					<div class="page-header-content">
						<div class="page-title">
							<h4><i class="icon-arrow-left52 position-left"></i> <span class="text-semibold">Tables</span> - Basic</h4>
						</div>

						<div class="heading-elements">
							<div class="heading-btn-group">
								<a href="#" class="btn btn-link btn-float text-size-small has-text"><i class="icon-bars-alt text-primary"></i><span>Statistics</span></a>
								<a href="#" class="btn btn-link btn-float text-size-small has-text"><i class="icon-calculator text-primary"></i> <span>Invoices</span></a>
								<a href="#" class="btn btn-link btn-float text-size-small has-text"><i class="icon-calendar5 text-primary"></i> <span>Schedule</span></a>
							</div>
						</div>
					</div>

					<div class="breadcrumb-line">
						<ul class="breadcrumb">
							<li><a href="index.html"><i class="icon-home2 position-left"></i> Home</a></li>
							<li><a href="table_basic.html">Tables</a></li>
							<li class="active">Basic</li>
						</ul>

						<ul class="breadcrumb-elements">
							<li><a href="#"><i class="icon-comment-discussion position-left"></i> Support</a></li>
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">
									<i class="icon-gear position-left"></i>
									Settings
									<span class="caret"></span>
								</a>

								<ul class="dropdown-menu dropdown-menu-right">
									<li><a href="#"><i class="icon-user-lock"></i> Account security</a></li>
									<li><a href="#"><i class="icon-statistics"></i> Analytics</a></li>
									<li><a href="#"><i class="icon-accessibility"></i> Accessibility</a></li>
									<li class="divider"></li>
									<li><a href="#"><i class="icon-gear"></i> All settings</a></li>
								</ul>
							</li>
						</ul>
					</div>
				</div>
				<!-- /page header -->


				<!-- Content area -->
				<div class="content">

					<!-- Basic tables title -->
					<h6 class="content-group text-semibold">
						Basic tables
						<small class="display-block">Tables with default <code>Bootstrap</code> styling</small>
					</h6>
					<!-- /basic tables title -->


					<!-- Basic table -->
					<div class="panel panel-flat">
						<div class="panel-heading">
							<h5 class="panel-title">Basic table</h5>
							<div class="heading-elements">
								<ul class="icons-list">
			                		<li><a data-action="collapse"></a></li>
			                		<li><a data-action="reload"></a></li>
			                		<li><a data-action="close"></a></li>
			                	</ul>
		                	</div>
						</div>

						<div class="panel-body">
							Example of a <code>basic</code> table. For basic styling (light padding and only horizontal dividers) add the base class <code>.table</code> to any <code>&lt;table&gt;</code>. It may seem super redundant, but given the widespread use of tables for other plugins like calendars and date pickers, we've opted to isolate our custom table styles.
						</div>

						<div class="table-responsive">
							<table class="table">
								<thead>
									<tr>
										<th>#</th>
										<th>First Name</th>
										<th>Last Name</th>
										<th>Username</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>1</td>
										<td>Eugene</td>
										<td>Kopyov</td>
										<td>@Kopyov</td>
									</tr>
									<tr>
										<td>2</td>
										<td>Victoria</td>
										<td>Baker</td>
										<td>@Vicky</td>
									</tr>
									<tr>
										<td>3</td>
										<td>James</td>
										<td>Alexander</td>
										<td>@Alex</td>
									</tr>
									<tr>
										<td>4</td>
										<td>Franklin</td>
										<td>Morrison</td>
										<td>@Frank</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<!-- /basic table -->


					<!-- Striped rows -->
					<div class="panel panel-flat">
						<div class="panel-heading">
							<h5 class="panel-title">Striped rows</h5>
							<div class="heading-elements">
								<ul class="icons-list">
			                		<li><a data-action="collapse"></a></li>
			                		<li><a data-action="reload"></a></li>
			                		<li><a data-action="close"></a></li>
			                	</ul>
		                	</div>
						</div>

						<div class="panel-body">
							Example of a table with <code>striped</code> rows. Use <code>.table-striped</code> added to the base <code>.table</code> class to add zebra-striping to any table odd row within the <code>&lt;tbody&gt;</code>. This styling doesn't work in IE8 and lower as <code>:nth-child</code> CSS selector isn't supported in these browser versions. Striped table can be combined with other table styles.
						</div>

						<div class="table-responsive">
							<table class="table table-striped">
								<thead>
									<tr>
										<th>#</th>
										<th>First Name</th>
										<th>Last Name</th>
										<th>Username</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>1</td>
										<td>Eugene</td>
										<td>Kopyov</td>
										<td>@Kopyov</td>
									</tr>
									<tr>
										<td>2</td>
										<td>Victoria</td>
										<td>Baker</td>
										<td>@Vicky</td>
									</tr>
									<tr>
										<td>3</td>
										<td>James</td>
										<td>Alexander</td>
										<td>@Alex</td>
									</tr>
									<tr>
										<td>4</td>
										<td>Franklin</td>
										<td>Morrison</td>
										<td>@Frank</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<!-- /striped rows -->


					<!-- Bordered table -->
					<div class="panel panel-flat">
						<div class="panel-heading">
							<h5 class="panel-title">Bordered table</h5>
							<div class="heading-elements">
								<ul class="icons-list">
			                		<li><a data-action="collapse"></a></li>
			                		<li><a data-action="reload"></a></li>
			                		<li><a data-action="close"></a></li>
			                	</ul>
		                	</div>
						</div>

						<div class="panel-body">
							Example of a table with fully <code>bordered</code> cells. Add <code>.table-bordered</code> to the base <code>.table</code> class for borders on all sides of the table and cells. This is a default Bootstrap option for the table, for more advanced border options check <a href="table_borders.html">Table borders</a> page. Bordered table can be combined with other table styles.
						</div>

						<div class="table-responsive">
							<table class="table table-bordered">
								<thead>
									<tr>
										<th>#</th>
										<th>First Name</th>
										<th>Last Name</th>
										<th>Username</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>1</td>
										<td>Eugene</td>
										<td>Kopyov</td>
										<td>@Kopyov</td>
									</tr>
									<tr>
										<td>2</td>
										<td>Victoria</td>
										<td>Baker</td>
										<td>@Vicky</td>
									</tr>
									<tr>
										<td>3</td>
										<td>James</td>
										<td>Alexander</td>
										<td>@Alex</td>
									</tr>
									<tr>
										<td>4</td>
										<td>Franklin</td>
										<td>Morrison</td>
										<td>@Frank</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<!-- /bordered table -->


					<!-- Bordered striped table -->
					<div class="panel panel-flat">
						<div class="panel-heading">
							<h5 class="panel-title">Bordered striped</h5>
							<div class="heading-elements">
								<ul class="icons-list">
			                		<li><a data-action="collapse"></a></li>
			                		<li><a data-action="reload"></a></li>
			                		<li><a data-action="close"></a></li>
			                	</ul>
		                	</div>
						</div>

						<div class="panel-body">
							Example of a <code>bordered</code> table with <code>stiped</code> rows. Add <code>.table-bordered</code> and <code>.table-striped</code> classes to the base <code>.table</code> class for borders and row striping. This method works with all table border options.
						</div>

						<div class="table-responsive">
							<table class="table table-bordered table-striped">
								<thead>
									<tr>
										<th>#</th>
										<th>First Name</th>
										<th>Last Name</th>
										<th>Username</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>1</td>
										<td>Eugene</td>
										<td>Kopyov</td>
										<td>@Kopyov</td>
									</tr>
									<tr>
										<td>2</td>
										<td>Victoria</td>
										<td>Baker</td>
										<td>@Vicky</td>
									</tr>
									<tr>
										<td>3</td>
										<td>James</td>
										<td>Alexander</td>
										<td>@Alex</td>
									</tr>
									<tr>
										<td>4</td>
										<td>Franklin</td>
										<td>Morrison</td>
										<td>@Frank</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<!-- /bordered striped table -->


					<!-- Hover rows -->
					<div class="panel panel-flat">
						<div class="panel-heading">
							<h5 class="panel-title">Hover rows</h5>
							<div class="heading-elements">
								<ul class="icons-list">
			                		<li><a data-action="collapse"></a></li>
			                		<li><a data-action="reload"></a></li>
			                		<li><a data-action="close"></a></li>
			                	</ul>
		                	</div>
						</div>

						<div class="panel-body">
							Example of a table with <code>hover</code> rows state. Add <code>.table-hover</code> to enable a hover state on table rows within a <code>&lt;tbody&gt;</code>.
						</div>

						<div class="table-responsive">
							<table class="table table-hover">
								<thead>
									<tr>
										<th>#</th>
										<th>First Name</th>
										<th>Last Name</th>
										<th>Username</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>1</td>
										<td>Eugene</td>
										<td>Kopyov</td>
										<td>@Kopyov</td>
									</tr>
									<tr>
										<td>2</td>
										<td>Victoria</td>
										<td>Baker</td>
										<td>@Vicky</td>
									</tr>
									<tr>
										<td>3</td>
										<td>James</td>
										<td>Alexander</td>
										<td>@Alex</td>
									</tr>
									<tr>
										<td>4</td>
										<td>Franklin</td>
										<td>Morrison</td>
										<td>@Frank</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<!-- /hover rows -->


					<!-- Scrollable table -->
					<div class="panel panel-flat">
						<div class="panel-heading">
							<h5 class="panel-title">Scrollable table</h5>
							<div class="heading-elements">
								<ul class="icons-list">
			                		<li><a data-action="collapse"></a></li>
			                		<li><a data-action="reload"></a></li>
			                		<li><a data-action="close"></a></li>
			                	</ul>
		                	</div>
						</div>

						<div class="panel-body">
							Example of a <code>scrollable</code> table. To use a fixed height with scrolling, wrap any table in a div with <code>.pre-scrollable</code> class. Max height of the table container will be <code>340px</code> and table will get a vertical scrollbar if its height is move than this value.
						</div>

						<div class="table-responsive pre-scrollable">
							<table class="table">
								<thead>
									<tr>
										<th>#</th>
										<th>First Name</th>
										<th>Last Name</th>
										<th>Username</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>1</td>
										<td>Eugene</td>
										<td>Kopyov</td>
										<td>@Kopyov</td>
									</tr>
									<tr>
										<td>2</td>
										<td>Victoria</td>
										<td>Baker</td>
										<td>@Vicky</td>
									</tr>
									<tr>
										<td>3</td>
										<td>James</td>
										<td>Alexander</td>
										<td>@Alex</td>
									</tr>
									<tr>
										<td>4</td>
										<td>Stanley</td>
										<td>Martins</td>
										<td>@Stan</td>
									</tr>
									<tr>
										<td>5</td>
										<td>Winnie</td>
										<td>the Pooh</td>
										<td>@Winnie</td>
									</tr>
									<tr>
										<td>6</td>
										<td>Garry</td>
										<td>Smith</td>
										<td>@Garry</td>
									</tr>
									<tr>
										<td>7</td>
										<td>Ian</td>
										<td>Berg</td>
										<td>@Ian</td>
									</tr>
									<tr>
										<td>8</td>
										<td>John</td>
										<td>Ryan</td>
										<td>@John</td>
									</tr>
									<tr>
										<td>9</td>
										<td>Frank</td>
										<td>Giggs</td>
										<td>@Frank</td>
									</tr>
									<tr>
										<td>10</td>
										<td>Jack</td>
										<td>Gram</td>
										<td>@Jack</td>
									</tr>
									<tr>
										<td>11</td>
										<td>Patrick</td>
										<td>Lawrence</td>
										<td>@Patrick</td>
									</tr>
									<tr>
										<td>12</td>
										<td>Lucy</td>
										<td>Gulf</td>
										<td>@Lucy</td>
									</tr>
									<tr>
										<td>13</td>
										<td>Dave</td>
										<td>Armstrong</td>
										<td>@Dave</td>
									</tr>
									<tr>
										<td>14</td>
										<td>Sean</td>
										<td>Lewis</td>
										<td>@Sean</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<!-- /scrollable table -->



					<!-- Panel body tables title -->
					<h6 class="content-group text-semibold">
						Panel body tables
						<small class="display-block">Tables placed inside <code>panel body</code>.</small>
					</h6>
					<!-- /panel body tables title -->


					<!-- Panel body table -->
					<div class="panel panel-flat">
						<div class="panel-heading">
							<h5 class="panel-title">Panel body table</h5>
							<div class="heading-elements">
								<ul class="icons-list">
			                		<li><a data-action="collapse"></a></li>
			                		<li><a data-action="reload"></a></li>
			                		<li><a data-action="close"></a></li>
			                	</ul>
		                	</div>
						</div>

						<div class="panel-body">
							<p class="content-group">Example of a table placed inside <code>panel body</code>. Such tables always have additional whitespace taken from <code>.panel-body</code> element padding.</p>

							<div class="table-responsive">
								<table class="table">
									<thead>
										<tr>
											<th>#</th>
											<th>First Name</th>
											<th>Last Name</th>
											<th>Username</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>1</td>
											<td>Eugene</td>
											<td>Kopyov</td>
											<td>@Kopyov</td>
										</tr>
										<tr>
											<td>2</td>
											<td>Victoria</td>
											<td>Baker</td>
											<td>@Vicky</td>
										</tr>
										<tr>
											<td>3</td>
											<td>James</td>
											<td>Alexander</td>
											<td>@Alex</td>
										</tr>
										<tr>
											<td>4</td>
											<td>Franklin</td>
											<td>Morrison</td>
											<td>@Frank</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
					<!-- /panel body table -->


					<!-- Framed panel body table -->
					<div class="panel panel-flat">
						<div class="panel-heading">
							<h5 class="panel-title">Framed table</h5>
							<div class="heading-elements">
								<ul class="icons-list">
			                		<li><a data-action="collapse"></a></li>
			                		<li><a data-action="reload"></a></li>
			                		<li><a data-action="close"></a></li>
			                	</ul>
		                	</div>
						</div>

						<div class="panel-body">
							<p class="content-group">Example of <code>framed</code> table inside panel body. Tables that placed inside panel body don't have border around them by default, <code>.table-framed</code> class adds border around the table.</p>

							<div class="table-responsive">
								<table class="table table-framed">
									<thead>
										<tr>
											<th>#</th>
											<th>First Name</th>
											<th>Last Name</th>
											<th>Username</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>1</td>
											<td>Eugene</td>
											<td>Kopyov</td>
											<td>@Kopyov</td>
										</tr>
										<tr>
											<td>2</td>
											<td>Victoria</td>
											<td>Baker</td>
											<td>@Vicky</td>
										</tr>
										<tr>
											<td>3</td>
											<td>James</td>
											<td>Alexander</td>
											<td>@Alex</td>
										</tr>
										<tr>
											<td>4</td>
											<td>Franklin</td>
											<td>Morrison</td>
											<td>@Frank</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
					<!-- /framed panel body table -->


					<!-- Bordered panel body table -->
					<div class="panel panel-flat">
						<div class="panel-heading">
							<h5 class="panel-title">Framed bordered</h5>
							<div class="heading-elements">
								<ul class="icons-list">
			                		<li><a data-action="collapse"></a></li>
			                		<li><a data-action="reload"></a></li>
			                		<li><a data-action="close"></a></li>
			                	</ul>
		                	</div>
						</div>

						<div class="panel-body">
							<p class="content-group">Example of <code>bordered framed</code> table inside panel body. By default bordered table also doesn't have a border, to use border around the bordered table add <code>.table-framed</code> to the <code>&lt;table></code>.</p>

							<div class="table-responsive">
								<table class="table table-bordered table-framed">
									<thead>
										<tr>
											<th>#</th>
											<th>First Name</th>
											<th>Last Name</th>
											<th>Username</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>1</td>
											<td>Eugene</td>
											<td>Kopyov</td>
											<td>@Kopyov</td>
										</tr>
										<tr>
											<td>2</td>
											<td>Victoria</td>
											<td>Baker</td>
											<td>@Vicky</td>
										</tr>
										<tr>
											<td>3</td>
											<td>James</td>
											<td>Alexander</td>
											<td>@Alex</td>
										</tr>
										<tr>
											<td>4</td>
											<td>Franklin</td>
											<td>Morrison</td>
											<td>@Frank</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
					<!-- /bordered panel body table -->


					<!-- Footer -->
					<div class="footer text-muted">
						&copy; 2015. <a href="#">Limitless Web App Kit</a> by <a href="http://themeforest.net/user/Kopyov" target="_blank">Eugene Kopyov</a>
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

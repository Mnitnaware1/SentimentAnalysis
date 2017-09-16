<div class="main-content-inner">
	<div class="breadcrumbs ace-save-state" id="breadcrumbs">
		<ul class="breadcrumb">
			<li><i class="ace-icon fa fa-home home-icon"></i> <a>Home</a></li>
			<li>Add Product</li>
		</ul>
	</div>

	<div class="page-content">
		<div class="page-header">
			<h1>
				<small> <i class="ace-icon fa fa-angle-double-right"></i> <a
					href="index.jsp?page=view_product">View Product</a>
				</small>
			</h1>
		</div>
		<!-- /.page-header -->
		<div class="row">
			<div class="col-xs-12">

				<form class="form-horizontal" role="form" method="post"
					name="frmAddFrom" id="frmAddFrom" enctype="multipart/form-data"
					action="">
					<div class="form-group">
						<div class="col-sm-6">
							<label class="col-sm-4 control-label no-padding-right"
								for="form-field-1-1">CATEGORY NAME</label>
							<div class="col-sm-8">
								<input type="text" id="form-field-1-1" autofocus=""
									placeholder="BRANCH NAME" name="txtDeptName" value=""
									class="form-control" />
							</div>
						</div>
						<div class="col-sm-6">
							<label class="col-sm-4 control-label no-padding-right"
								for="form-field-1-1">PRODUCT NAME</label>
							<div class="col-sm-8">
								<input type="text" autofocus="" id="form-field-1-1"
									name="txtIsActive" placeholder="NAME" 
									class="form-control">
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-6">
							<label class="col-sm-4 control-label no-padding-right"
								for="form-field-1-1">PRODUCT PRICE</label>
							<div class="col-sm-8">
								<input type="text" id="form-field-1-1" autofocus=""
									placeholder="BRANCH NAME" name="txtDeptName" value=""
									class="form-control" />
							</div>
						</div>
						<div class="col-sm-6">
							<label class="col-sm-4 control-label no-padding-right"
								for="form-field-1-1">TOTAL QUANTITY</label>
							<div class="col-sm-8">
								<input type="text" autofocus="" id="form-field-1-1"
									name="txtIsActive" placeholder="BALANCE" 
									class="form-control">
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-6">
							<label class="col-sm-4 control-label no-padding-right"
								for="form-field-1-1">PRODUCT IMAGE</label>
							<div class="col-sm-8">
								<input type="file" id="form-field-1-1" autofocus=""
									placeholder="BRANCH NAME" name="txtDeptName" value=""
									class="form-control" />
							</div>
						</div>
						<div class="col-sm-6">
							<label class="col-sm-4 control-label no-padding-right"
								for="form-field-1-1">DESCRIPTION</label>
							<div class="col-sm-8">
								<input type="text" autofocus="" id="form-field-1-1"
									name="txtIsActive" placeholder="BALANCE" 
									class="form-control">
							</div>
						</div>
					</div>
			</div>
		</div>
		<div class="clearfix form-actions">
			<div class="col-md-offset-3 col-md-9">
				<input type="submit" class="btn btn-info" name="btnSubmit"
					value="Save" /> &nbsp; &nbsp; &nbsp; <input type="reset"
					class="btn" value="Clear" />
			</div>
		</div>

		<div class="hr hr-24"></div>
		</form>
		<div class="hr hr-18 dotted hr-double"></div>
	</div>
	<!-- /.col -->
</div>
<!-- /.row -->
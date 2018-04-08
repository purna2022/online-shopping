<div class="container">
	<div class="row">
		<!--  TO display the side bar menu  -->

		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>

		</div>

		<!--  To display  	the actual products -->

		<div class="col-lg-9">
			<!--Added bread crum component  -->
			<div class="row">
				<div class="col-lg-12">
					<c:if test="${userClickAllProduts==true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">All Products</li>
						</ol>
					</c:if>

					<c:if test="${userClickCatagoryProduts==true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">Catagory</li>
							<li class="active">${catagory.name}</li>

						</ol>
					</c:if>
				</div>

			</div>


		</div>
	</div>
</div>
<html>
<head>
<title>Customer APIs Implementation</title>
<link href="https://fonts.googleapis.com/css2?family=Lato&display=swap"
	rel="stylesheet">
<link rel="stylesheet" href="/css/customer-details.css" />
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.18/css/jquery.dataTables.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript"
	src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.js"></script>
<script src="/js/customer-details.js"></script>
</head>
<body>
	<span><a href="/">Homepage</a></span>
	<br />
	<br />
	<div id="top-div">
		<table id="form">
			<tr>
				<td><h2 id="top">Customer Form</h2></td>
			</tr>
			<tr>
				<td><input type="text" id="customer_id" hidden></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" id="name" placeholder="Adams"></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><input type="text" id="gender" placeholder="MALE"></td>
			</tr>
			<tr>
				<td>Email Address</td>
				<td><input type="text" id="email_address"
					placeholder="adam@example.com"></td>
			</tr>
			<tr>
				<td>Mobile Number</td>
				<td><input type="text" id="mobile_number"
					placeholder="1234567890"></td>
			</tr>
			<tr>
				<td>Address Line 1</td>
				<td><input type="text" id="address_line_1"
					placeholder="Cecilia Chapman"></td>
			</tr>
			<tr>
				<td>Address Line 2</td>
				<td><input type="text" id="address_line_2"
					placeholder="Mankato Mississippi"></td>
			</tr>
			<tr>
				<td>State</td>
				<td><input type="text" id="state" placeholder="Texas"></td>
			</tr>
			<tr>
				<td>City</td>
				<td><input type="text" id="city" placeholder="Houston"></td>
			</tr>
			<tr>
				<td>Zipcode</td>
				<td><input type="text" id="zipcode" placeholder="985575"></td>
			</tr>
			<tr>
				<td>Country</td>
				<td><input type="text" id="country" placeholder="America"></td>
			</tr>

			<tr colspan="2">
				<td><input type="button" value="Create" id="btnAddCustomer"></td>
			</tr>
		</table>
	</div>
	<div id="bottom-div">
		<h3 id="top">Customer Details</h3>
		<table width="100%" border="1" cellspacing="0" cellpadding="2"
			id="customerTable">
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Gender</th>
					<th>Email Address</th>
					<th>Mobile Number</th>
					<th>Address Line 1</th>
					<th>Address Line 2</th>
					<th>State</th>
					<th>City</th>
					<th>Zipcode</th>
					<th>Country</th>
					<th>Action</th>
				</tr>
			</thead>

			<tbody>
				<!-- table body will be generated -->
			</tbody>

		</table>
	</div>
</body>
</html>
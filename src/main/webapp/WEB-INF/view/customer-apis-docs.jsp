<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Customer APIs Implementation</title>
<link href="https://fonts.googleapis.com/css2?family=Lato&display=swap"
	rel="stylesheet">
<link rel="stylesheet" href="/css/customer-apis.css" />
</head>
<body>
	<span><a href="/">Homepage</a></span>
	<h3>Customer REST APIs Endpoints</h3>
	<ol>
		<li>GET</li>
		<p>
			<a href="http://localhost:8080/customers" target="_blank">http://localhost:8080/customers</a>
		</p>
		<p>Paste the above URL into the request URL in Postman and select
			GET as the HTTP method and hit send. It will return all the customers
			in JSON format.</p>
		<li>POST</li>
		<p>
			<a href="http://localhost:8080/customers" target="_blank">http://localhost:8080/customers</a>
		</p>
		<p>
			Paste the above URL into the request URL in Postman and select POST
			as the HTTP method. Open the Body tab and paste the below request
			body<br /> into raw and select JSON from the dropdown. Hit send and
			this will create a new customer according to the data provided in the
			request body.
		</p>
		<p>
			Sample Request Body : <br />
		<pre>
{
	"name":"Garry",
	"gender":"MALE",
	"email_address":"garry@gmail.com",
	"mobile_number":"832488",
	"address_line_1":"New Palace",
	"address_line_2":"Santiago",
	"state":"Berot",
	"city":"Heisenberg",
	"zipcode":85588,
	"country":"Europe"
}
			</pre>
		</p>
		<li>PUT</li>
		<p>
			<a href="http://localhost:8080/customers/{customer_id}"
				target="_blank">http://localhost:8080/customers/{customer_id}</a>
		</p>
		<p>
			Paste the above URL into the request URL and replace {customer_id}
			with any customer's id and select PUT as the HTTP method. Paste the
			below request body<br /> in raw under Body tab and select JSON from
			the dropdown. Hit send and this will update the customer whose id
			matches with the id defined in the path.
		</p>
		<p>
			Sample Request Body : <br />
		<pre>
{
	"name":"Jibi",
	"gender":"FEMALE",
	"email_address":"jibi@gmail.com",
	"mobile_number":"2324",
	"address_line_1":"Paston",
	"address_line_2":"Hublin",
	"state":"Jacobian",
	"city":"Herut",
	"zipcode":3223,
	"country":"Africa"
}
			</pre>
		<li>DELETE</li>
		<p>
			<a href="http://localhost:8080/customers/{customer_id}"
				target="_blank">http://localhost:8080/customers/{customer_id}</a>
		</p>
		<p>
			Paste the above URL into the request URL and replace {customer_id}
			with any customer's id and select DELETE as the HTTP method. Select
			none from the body tab.<br />Hit send and this will delete the
			customer whose id matches with the id defined in the path.
		</p>
	</ol>



</body>
</html>
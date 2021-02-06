$(document).ready(function () {

    var customer = {};
    var dynamicURL = "";
    var methodName = "";
    getAllCustomers();
    
    $('#btnAddCustomer').click(function () {
        var customer_id = $('#customer_id').val();
        customer.name = $('#name').val();
        customer.email_address = $('#email_address').val();
        customer.gender = $('#gender').val();
        customer.mobile_number = $('#mobile_number').val();
        customer.address_line_1 = $('#address_line_1').val();
        customer.address_line_2 = $('#address_line_2').val();
        customer.state = $('#state').val();
        customer.city = $('#city').val();
        customer.zipcode = $('#zipcode').val();
        customer.country = $('#country').val();

        if(customer_id){
            dynamicURL = "http://localhost:8080/customers/"+customer_id;
            methodName = "PUT";
        }else{
            dynamicURL = "http://localhost:8080/customers/";
            methodName = "POST";
        }
        
        var customerObject = JSON.stringify(customer);
        
        $.ajax({
            url: dynamicURL,
            method: methodName,
            data: customerObject,
            contentType: 'application/json; charset=utf-8',
            success: function () {
                alert('Data Updated Successfully');
                getAllCustomers();
                reset();
            },
            error: function (error) {
                alert(error);
            }
        })
    })
})

function getAllCustomers() {
    $.ajax({
        url: "http://localhost:8080/customers",
        method: "GET",
        dataType: "json",
        success: function (data) {
            var tableBody = $('#customerTable tbody');
            tableBody.empty();
            $(data).each(function (index, element) {
                tableBody.append('<tr><td>'+element.customer_id+'</td><td>'+element.name+'</td><td>'+element.gender+'</td><td>'+element.email_address+'</td><td>'+element.mobile_number+'</td><td>'+element.address_line_1+'</td><td>'+element.address_line_2+'</td><td>'+element.state+'</td><td>'+element.city+'</td><td>'+element.zipcode+'</td><td>'+element.country+'</td><td><button onclick = "update('+element.customer_id+')">Update</button></td></tr>');
          })
        },
        error: function (error) {
            alert(error);
        }
    })
}

function update(customer_id){
    $.ajax({
        url: 'http://localhost:8080/customers/'+customer_id,
        method: 'GET',
        dataType: 'json',
        success: function (data) {
        	$('#customer_id').val(data.customer_id);
            $('#name').val(data.name);
            $('#gender').val(data.gender);
            $('#email_address').val(data.email_address);
            $('#mobile_number').val(data.mobile_number);
            $('#address_line_1').val(data.address_line_1);
            $('#address_line_2').val(data.address_line_2);
            $('#state').val(data.state);
            $('#city').val(data.city);
            $('#zipcode').val(data.zipcode);
            $('#country').val(data.country);
            getAllCustomers();
        },
        error: function (error) {
            window.alert("User Exists");
        }
    })

    var btn = document.getElementById("btnAddCustomer");
    btn.value = "Update";
    btn.innerHTML = "Update";
}

function reset(){
    $('#name').val('');
    $('#gender').val('');
    $('#email_address').val('');
    $('#mobile_number').val('');
    $('#address_line_1').val('');
    $('#address_line_2').val('');
    $('#state').val('');
    $('#city').val('');
    $('#zipcode').val('');
    $('#country').val('');
}

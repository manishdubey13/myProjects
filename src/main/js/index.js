
	// This function pulls all of the values from the HTML forms, sends them to
	// the 'computeFutureValue' function, and then outputs the value to a div
	function calculations() {
		var principal = parseFloat(document.getElementById('principal').value);
		var annualRate = parseFloat(document.getElementById('annualrate').value);
		var years = parseInt(document.getElementById('years').value);
		var periodsPerYear = parseInt(document.getElementById('periods').value);

		var futureValue = "$" + computeFutureValue(principal, annualRate, years, periodsPerYear).toFixed(2);
		document.getElementById("futurevalue").value = futureValue;
	}

	// This function does all of the actual calculations. The formula is f=a(1+r)^n.
	function computeFutureValue(principal, annualRate, years, periodsPerYear)
	{
		var rate = (annualRate / periodsPerYear) / 100;
		var n = (years * periodsPerYear);
		var futureValue = (principal * Math.pow((1 + rate), n));
		return futureValue;
	}

	// This function is used to reset all of the forms to empty
	function resetForms()
	{
		document.getElementById('forms').reset();
	}

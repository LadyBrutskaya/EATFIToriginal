<!DOCTYPE html>
<html>
    <head>
		<meta charset="utf-8">
        <title>Person Info</title>
		<link href="../../css/personInformation.css" rel="stylesheet" type="text/css"/>
		<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script type="text/javascript" src="../../js/ari.js"></script>
    </head>
    <body>
        <div class="information">
			<form>
				<div class="name">
					Name<br>
					<input type="text" name="name"/>
				</div>
				<div class="gender">
					Gender<br>
					<label for="man"><input id="man" class="genderRadio" type="radio" name="gender" value="man"/><i></i> Man </label>
					<label for="woman"><input id="woman" class="genderRadio" type="radio" name="gender" value="woman"/><i></i> Woman </label>
				</div>
				<div class="birthdate">
					Birthdate<br>
					<input type="date" name="birthdate"/>
				</div>
				<div  class="weight">
					Weight, kg<br>
					<input type="number" name="weight" min="20" max="250"/>
				</div>
				<div class="height">
					Height, cm<br>
					<input type="number" name="height" min="50" max="300"/>
				</div>
				<div class="goal">
					Goal<br>
					<div class="fontSize16">
						<label for="g1"><input id="g1" class="goalRadio" type="radio" name="goal" value="weight gain"/><i></i> weight gain </label>
						<label for="g2"><input id="g2" class="goalRadio" type="radio" name="goal" value="weight maintaining"/><i></i> weight maintaining</label>
						<label for="g3"><input id="g3" class="goalRadio" type="radio" name="goal" value="weight decrease"/><i></i> weight decrease</label>
					</div>
				</div>
				<div class="activity">
					Activity<br>
					<div class="fontSize16">
						<label for="a1"><input id="a1" class="activityRadio" type="radio" name="activity" value="active"/><i></i> active</label>
						<label for="a2"><input id="a2" class="activityRadio" type="radio" name="activity" value="low-active"/><i></i> low-active</label>
						<label for="a3"><input id="a3" class="activityRadio" type="radio" name="activity" value="passive"/><i></i> passive</label>
					</div>
				</div>
				<div class="formSubmit">
						<input class="submit" type="button" value="Save"/>
				</div>
			</form>
		</div>
    </body>
</html>
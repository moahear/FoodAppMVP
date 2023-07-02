package com.gamil.moahear.foodappmvp.data.model.home


import com.google.gson.annotations.SerializedName

data class ResponseFoods(
    @SerializedName("meals")
    val meals: List<Meal?>?
) {
    data class Meal(
        @SerializedName("dateModified")
        val dateModified: Any?, // null
        @SerializedName("idMeal")
        val idMeal: String?, // 53065
        @SerializedName("strArea")
        val strArea: String?, // Japanese
        @SerializedName("strCategory")
        val strCategory: String?, // Seafood
        @SerializedName("strCreativeCommonsConfirmed")
        val strCreativeCommonsConfirmed: Any?, // null
        @SerializedName("strDrinkAlternate")
        val strDrinkAlternate: Any?, // null
        @SerializedName("strImageSource")
        val strImageSource: Any?, // null
        @SerializedName("strIngredient1")
        val strIngredient1: String?, // Sushi Rice
        @SerializedName("strIngredient10")
        val strIngredient10: String?,
        @SerializedName("strIngredient11")
        val strIngredient11: String?,
        @SerializedName("strIngredient12")
        val strIngredient12: String?,
        @SerializedName("strIngredient13")
        val strIngredient13: String?,
        @SerializedName("strIngredient14")
        val strIngredient14: String?,
        @SerializedName("strIngredient15")
        val strIngredient15: String?,
        @SerializedName("strIngredient16")
        val strIngredient16: String?,
        @SerializedName("strIngredient17")
        val strIngredient17: String?,
        @SerializedName("strIngredient18")
        val strIngredient18: String?,
        @SerializedName("strIngredient19")
        val strIngredient19: String?,
        @SerializedName("strIngredient2")
        val strIngredient2: String?, // Rice wine
        @SerializedName("strIngredient20")
        val strIngredient20: String?,
        @SerializedName("strIngredient3")
        val strIngredient3: String?, // Caster Sugar
        @SerializedName("strIngredient4")
        val strIngredient4: String?, // Mayonnaise
        @SerializedName("strIngredient5")
        val strIngredient5: String?, // Rice wine
        @SerializedName("strIngredient6")
        val strIngredient6: String?, // Soy Sauce
        @SerializedName("strIngredient7")
        val strIngredient7: String?, // Cucumber
        @SerializedName("strIngredient8")
        val strIngredient8: String?,
        @SerializedName("strIngredient9")
        val strIngredient9: String?,
        @SerializedName("strInstructions")
        val strInstructions: String?, // STEP 1TO MAKE SUSHI ROLLS: Pat out some rice. Lay a nori sheet on the mat, shiny-side down. Dip your hands in the vinegared water, then pat handfuls of rice on top in a 1cm thick layer, leaving the furthest edge from you clear.STEP 2Spread over some Japanese mayonnaise. Use a spoon to spread out a thin layer of mayonnaise down the middle of the rice.STEP 3Add the filling. Get your child to top the mayonnaise with a line of their favourite fillings – here we’ve used tuna and cucumber.STEP 4Roll it up. Lift the edge of the mat over the rice, applying a little pressure to keep everything in a tight roll.STEP 5Stick down the sides like a stamp. When you get to the edge without any rice, brush with a little water and continue to roll into a tight roll.STEP 6Wrap in cling film. Remove the mat and roll tightly in cling film before a grown-up cuts the sushi into thick slices, then unravel the cling film.STEP 7TO MAKE PRESSED SUSHI: Layer over some smoked salmon. Line a loaf tin with cling film, then place a thin layer of smoked salmon inside on top of the cling film.STEP 8Cover with rice and press down. Press about 3cm of rice over the fish, fold the cling film over and press down as much as you can, using another tin if you have one.STEP 9Tip it out like a sandcastle. Turn block of sushi onto a chopping board. Get a grown-up to cut into fingers, then remove the cling film.STEP 10TO MAKE SUSHI BALLS: Choose your topping. Get a small square of cling film and place a topping, like half a prawn or a small piece of smoked salmon, on it. Use damp hands to roll walnut-sized balls of rice and place on the topping.STEP 11Make into tight balls. Bring the corners of the cling film together and tighten into balls by twisting it up, then unwrap and serve.
        @SerializedName("strMeal")
        val strMeal: String?, // Sushi
        @SerializedName("strMealThumb")
        val strMealThumb: String?, // https://www.themealdb.com/images/media/meals/g046bb1663960946.jpg
        @SerializedName("strMeasure1")
        val strMeasure1: String?, // 300ml 
        @SerializedName("strMeasure10")
        val strMeasure10: String?,
        @SerializedName("strMeasure11")
        val strMeasure11: String?,
        @SerializedName("strMeasure12")
        val strMeasure12: String?,
        @SerializedName("strMeasure13")
        val strMeasure13: String?,
        @SerializedName("strMeasure14")
        val strMeasure14: String?,
        @SerializedName("strMeasure15")
        val strMeasure15: String?,
        @SerializedName("strMeasure16")
        val strMeasure16: String?,
        @SerializedName("strMeasure17")
        val strMeasure17: String?,
        @SerializedName("strMeasure18")
        val strMeasure18: String?,
        @SerializedName("strMeasure19")
        val strMeasure19: String?,
        @SerializedName("strMeasure2")
        val strMeasure2: String?, // 100ml
        @SerializedName("strMeasure20")
        val strMeasure20: String?,
        @SerializedName("strMeasure3")
        val strMeasure3: String?, // 2 tbs
        @SerializedName("strMeasure4")
        val strMeasure4: String?, // 3 tbs
        @SerializedName("strMeasure5")
        val strMeasure5: String?, // 1 tbs
        @SerializedName("strMeasure6")
        val strMeasure6: String?, // 1 tbs
        @SerializedName("strMeasure7")
        val strMeasure7: String?, // 1
        @SerializedName("strMeasure8")
        val strMeasure8: String?,
        @SerializedName("strMeasure9")
        val strMeasure9: String?,
        @SerializedName("strSource")
        val strSource: String?, // https://www.bbcgoodfood.com/recipes/simple-sushi
        @SerializedName("strTags")
        val strTags: Any?, // null
        @SerializedName("strYoutube")
        val strYoutube: String? // https://www.youtube.com/watch?v=ub68OxEypaY
    )
}
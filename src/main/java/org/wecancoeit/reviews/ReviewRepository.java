package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();


    //constructor to handle our database
    public ReviewRepository(){
        Review alcapurrias = new Review(1L, "Alcapurrias", "/images/alcapurrias.jpg", "Appetizer", "This delicacy comes with almost any meat protein. Personally, I love it with beef. It is very flavorful and i would definitely recommend");
        Review yellowRiceWithPigeonPeas = new Review(2L, "Yellow Rice with Pigeon Peas", "/images/arrozConGandules.jpg", "Main Course", "This is my favorite rice EVER, I could eat this everyday and not get tired. It may sound weird because why are the peas even called like that, but they do not taste like your normal peas. 100% would recommend!");
        Review empanadillas = new Review(3L, "Empanadillas", "/images/empanadillas.jpg", "Appetizer", "We make this with almost any protein as well, some that are very popular in Puerto Rico are: beef, chicken, pizza, fish, and crab. I am not a fan of the fish and crab but that is just because I am not a fan of that type of protein. I can describe the flavor but these are a must have, definitely try if given the chance");
        Review mofongoConCarneFrita = new Review(5L, "Fried Plantain with pork", "/images/mofongo-carne-frita.jpg", "Main Course", "When you visit Puerto Rico, you will see this in almost every restaurant! This combination is my favorite but you can put together the fried plantain with almost any protein and you will like it! You can taste the garlic in the fried plantain and the good seasoning in the pork, I will never get over this dish.");
        Review tembleque = new Review(4L, "Tembleque", "/images/tembleque.jpg", "Dessert", "I would say this is one of my favorite desserts growing up. Is creamy, beautiful taste of coconut but not to overpowering and with the cinnamon on top it makes it taste very rich. Definitely worth trying! When I was little I used to hate coconut but i loved this dessert because I was not aware it was made out of coconuts, when my mom told me... it is safe to say that I was shocked and disappointed at myself. Still not in love with coconuts but tembleque has my heart.");

        reviewsList.put(alcapurrias.getId(), alcapurrias);
        reviewsList.put(empanadillas.getId(), empanadillas);
        reviewsList.put(yellowRiceWithPigeonPeas.getId(), yellowRiceWithPigeonPeas);
        reviewsList.put(mofongoConCarneFrita.getId(), mofongoConCarneFrita);
        reviewsList.put(tembleque.getId(), tembleque);
    }

    //constructor for testing purposes only... uses varArgs to add none or as many objects as we want
    public ReviewRepository(Review ...reviewsToAdd){
        for(Review review : reviewsToAdd){
            reviewsList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewsList.values();
    }
}

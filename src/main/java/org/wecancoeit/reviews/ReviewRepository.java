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
        Review alcapurrias = new Review(1L, "Alcapurrias", "https://www.africanbites.com/wp-content/uploads/2017/08/IMG_9913.jpg", "Appetizers", "This delicacy comes with almost any meat protein. Personally I love it with beef. It is very flavorful and i would definitely recommend");
        Review yellowRiceWithPigeonPeas = new Review(2L, "Yellow Rice with Pigeon Peas", "https://www.cookedbyjulie.com/wp-content/uploads/2015/10/arroz-con-gandules-one-360x360.jpg", "Main Course", "This is my favorite rice EVER, I could eat this everyday and not get tired. It may sound weird because why are the peas even called like that, but they do not taste like your normal peas. 100% would recommend!");
        Review empanadillas = new Review(3L, "Empanadillas", "https://cdn.sanity.io/images/02sbe50v/content/af65dcb58361293a8f38a6792725d0f98c7747fa-1080x1080.png?w=300&fit=max&auto=format", "Appetizer", "We make this with almost any protein as well, some that are very popular in Puerto Rico are: beef, chicken, pizza, fish, and crab. I am not a fan of the fish and crab but that is just because I am not a fan of that type of protein. I can describe the flavor but these are a must have, definitely try if given the chance");

        reviewsList.put(alcapurrias.getId(), alcapurrias);
        reviewsList.put(yellowRiceWithPigeonPeas.getId(), yellowRiceWithPigeonPeas);
        reviewsList.put(empanadillas.getId(), empanadillas);
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

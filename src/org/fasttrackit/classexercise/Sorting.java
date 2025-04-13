package org.fasttrackit.classexercise;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Sorting {
    List<Restaurant> restaurants = new ArrayList<>();

    public List<String> getRestaurantsInACity(String city) {
        List<String> restaurantsList = new ArrayList<>();
        for (Restaurant r : restaurants) {
            if (r.city().equals(city)) {
                restaurantsList.add(r.name());
            }
        }
        return restaurantsList;
    }


    public List<String> getRestaurantsOfSomeType(String type) {
        List<String> restaurantsList = new ArrayList<>();
        for (Restaurant r : restaurants) {
            if (r.type().equals(type)) {
                restaurantsList.add(r.name());
            }
        }
        return restaurantsList;
    }


    public Map<String, String> restaurantNameToCity() {
        Map<String, String> rCities = new HashMap<>();
        for (Restaurant r : restaurants) {
            rCities.put(r.name(), r.city());
        }
        return rCities;
    }

    public Map<String, String> restaurantsToType() {
        Map<String, String> rType = new HashMap<>();
        for (Restaurant r : restaurants) {
            rType.put(r.name(), r.type());
        }
        return rType;
    }

    public Map<Integer, List<String>> restaurantsByRating() {
        Map<Integer, List<String>> restaurantsRating = new HashMap<>();
        List<Integer> ratings = new ArrayList<>();
        for (Restaurant r : restaurants) {
            if (!ratings.contains(r.rating())) {
                ratings.add(r.rating());
            }
        }
        for (Integer i : ratings) {
            for (Restaurant r : restaurants) {
                if (r.rating() == (i)) {
                    if (!restaurantsRating.containsKey(i)) {
                        restaurantsRating.put(i, new ArrayList<>());
                    }
                    restaurantsRating.get(i).add(r.name());
                }
            }
        }
        return restaurantsRating;
    }

    public Map<String, List<String>> restaurantsByCity() {
        Map<String, List<String>> restaurantsCity = new HashMap<>();
        List<String> cities = new ArrayList<>();
        for (Restaurant r : restaurants) {
            if (!cities.contains(r.city())) {
                cities.add(r.city());
            }
        }
        for (String i : cities) {
            for (Restaurant j : restaurants) {
                if (j.city().equals(i)) {
                    if (!restaurantsCity.containsKey(i)) {
                        restaurantsCity.put(i, new ArrayList<>());
                    }
                    restaurantsCity.get(i).add(j.name());
                }
            }
        }
        return restaurantsCity;
    }

    public Map<String, List<String>> restaurantsByType() {
        Map<String, List<String>> restaurantsType = new HashMap<>();
        List<String> types = new ArrayList<>();
        for (Restaurant r : restaurants) {
            if (!types.contains(r.type())) {
                types.add(r.type());
            }
        }
        for (String i : types) {
            for (Restaurant k : restaurants) {
                if (k.type().equals(i)) {
                    if (!restaurantsType.containsKey(i)) {
                        restaurantsType.put(i, new ArrayList<>());
                    }
                    restaurantsType.get(i).add(k.name());
                }
            }
        }
        return restaurantsType;
    }

    public Restaurant restaurantGreatestRating(String city) {
        int max = 0;
        Restaurant restaurant = null;
        for (Restaurant r : restaurants) {
            if (r.city().equals(city)) {
                if (r.rating() > max) {
                    max = r.rating();
                    restaurant = r;
                }
            }
        }
        return restaurant;
    }

    public Restaurant restaurantTypeGreatestRating(String city, String type) {
        int max = 0;
        Restaurant restaurant = null;
        for (Restaurant r : restaurants) {
            if (r.city().equals(city) && (r.type().equals(type))) {
                if (r.rating() > max) {
                    max = r.rating();
                    restaurant = r;
                }
            }
        }
        return restaurant;
    }
}
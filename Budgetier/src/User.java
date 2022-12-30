import java.io.*;
public class User extends Main{
    // create user class

    public String name;
    private float housing;
    private float utilities;
    private float transportation;
    private float food;
    private float entertainment;
    private float debt;
    private float other;
    private float savings;
    private float income;

    public User(String name) {
        super();
    }

    public float getSavings() {
        return savings;
    }

    public void setSavings(float savings) {
        this.savings = savings;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHousing() {
        return housing;
    }

    public void setHousing(float housing) {
        this.housing = housing;
    }

    public float getUtilities() {
        return utilities;
    }

    public void setUtilities(float utilities) {
        this.utilities = utilities;
    }

    public float getTransportation() {
        return transportation;
    }

    public void setTransportation(float transportation) {
        this.transportation = transportation;
    }

    public float getFood() {
        return food;
    }

    public void setFood(float food) {
        this.food = food;
    }

    public float getEntertainment() {
        return entertainment;
    }

    public void setEntertainment(float entertainment) {
        this.entertainment = entertainment;
    }

    public float getDebt() {
        return debt;
    }

    public void setDebt(float debt) {
        this.debt = debt;
    }

    public float getOther() {
        return other;
    }

    public void setOther(float other) {
        this.other = other;
    }

    public User(String name, float housing, float utilities, float transportation, float food, float entertainment, float debt, float other){
        this.name = name;
        this.housing = housing;
        this.utilities = utilities;
        this.transportation = transportation;
        this.food = food;
        this.entertainment = entertainment;
        this.debt = debt;
        this.other = other;
    }


    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }
}

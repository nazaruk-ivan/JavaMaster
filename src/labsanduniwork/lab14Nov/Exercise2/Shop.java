package labsanduniwork.lab14Nov.Exercise2;

public class Shop {
    private String name;
    private int numberOfArticles;
    private int[] articles;

    {
        System.out.println("Welcome to the new shop");
    }

    public Shop(String name, int numberOfArticles, int[] articles){
        this.name = name;
        this.numberOfArticles = numberOfArticles;
        this.articles = articles;
    }

    //empty constructor
    public Shop(){
        this.name = "shop open soon";
        this.numberOfArticles = 0;
        this.articles = new int[1];

    }

    public String getName(){
        return name;
    }

    public int getNumberOfArticles(){
        return numberOfArticles;
    }


    public void setName(String newName){
        this.name = newName;
        System.out.println("Name was changed!");
    }

    public void setNumberOfArticles(int numberOfArticlesNew){
        if (numberOfArticlesNew > 0) {
            this.numberOfArticles = numberOfArticlesNew;
        } else {
            System.out.println("number of articles can't be less than 0");
        }
    }

    public int[] getArticles() {
        return articles;
    }

    public void setArticles(int[] newArticles) {
        for (int x = 0; x < newArticles.length; x++) {
            if (newArticles[x] < 0) {
                System.out.println("articles array can't contain negative numbers");
                return;
            }
        }
        this.articles = newArticles;
        System.out.println("Articles updated successfully.");
    }

    public void decrement(int i){
        if (i >= 0 && i < articles.length && articles[i] > 0){
            articles[i]--;
        }
    }

}

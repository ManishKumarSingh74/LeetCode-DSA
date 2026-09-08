class Solution {
    public void dfs(int[][] image, int sr, int sc, int original,int newcolor){
        int m = image.length;
        int n = image[0].length;
        if(sr<0 || sc<0 || sr>=m || sc>=n || image[sr][sc]!=original){
            return;
        }
        image[sr][sc] = newcolor;
        dfs(image,sr+1,sc,original,newcolor);
        dfs(image,sr-1,sc,original,newcolor);
        dfs(image,sr,sc+1,original,newcolor);
        dfs(image,sr,sc-1,original,newcolor);
    }
    public int[][] floodFill(int[][] image, int sr, int sc,int color) {

        int original = image[sr][sc];

        if(original == color) {
            return image;
        }
        
        dfs(image,sr,sc,original,color);
        return image;

    }
}
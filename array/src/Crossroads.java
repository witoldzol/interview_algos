public class Crossroads {
  int getMax(int i, int j, char[][] arr){
    return Math.max(Math.max(visit(i+1,j,arr),visit(i-1,j,arr)),Math.max(visit(i,j+1,arr),visit(i,j-1,arr)));
  }
  int visit(int i, int j, char[][] arr){
    return calculatePaths(i,j,arr);
  }
  int calculatePaths(int i, int j, char[][] arr){
    int maxI = arr.length;
    int maxJ = arr[i].length;
    int paths = 0;
    //above
    if(i-1>=0){
      if(arr[i-1][j] == 'C' || arr[i-1][j] == 'P'){
        paths +=1;
      }
    }
    //below
    if(i+1<maxI){
      if(arr[i+1][j] == 'C' || arr[i+1][j] == 'P'){
        paths +=1;
      }
    }
    //left
    if(j-1>=0){
      if(arr[i][j-1] == 'C' || arr[i][j-1] == 'P'){
        paths +=1;
      }
    }
    //left
    if(j+1<maxJ){
      if(arr[i][j+1] == 'C' || arr[i][j+1] == 'P'){
        paths +=1;
      }
    }
    if(paths == 0) return -1;
    return paths -1;
  }
}

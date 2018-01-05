package Lessons;

public class Calculator {

    private int result;

    public void add(int... params) {
        for (int i : params) {
            this.result += i;
        }
    }

    public void minus(int... params) {
            if (result!=0) {
                this.result -= params[0];
            }
            else {
                this.result=params[0]-params[1];
            }

    }

    public void div (int... params)throws UserExeption{
            if (params.length>0) {
                if (result != 0) {
                    this.result /= params[0];
                } else {
                    this.result = params[0] / params[1];
                }
            }
            else {
                throw new UserExeption("you should enter params.");
            }
        }

    public void cleanResult (){
        this.result=0;
    }

    public int getResult() {
        return this.result;
    }

    public void chooseoperation (String operation, int... params) throws UserExeption{
        if (operation.equals("plus")){
            add(params);
        }
        else if (operation.equals("minus")){
            minus(params);
        }
        else if (operation.equals("div")){
            div(params);
        }
    }
}

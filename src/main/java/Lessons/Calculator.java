package Lessons;

public class Calculator {

    private int result;
    /*
     operation +
     */
    public void add(int... params) throws UserException {
        if (params.length<1)
            throw new UserException("you should enter params.");
        for (int i : params) {
            this.result += i;
        }
    }
    /*
     operation -
     */
    public void minus(int... params) throws UserException {
        if (params.length<1)
            throw new UserException("you should enter params.");

            if (result!=0) {
                this.result -= params[0];
            }
            else {
                this.result=params[0]-params[1];
            }
    }
    /*
     operation /
     */
    public void div (int... params)throws UserException {
            if (params.length>0) {
                if (result != 0) {
                    for (int param:params  ) {
                        if (param != 0)
                        this.result /= param;
                        else {
                            throw new IllegalArgumentException("You try to div by 0. Please enter other params");
                        }
                    }
                } else {
                    if (params[0]==0 || params[1]==0)
                        throw new IllegalArgumentException("You try to div by 0. Please enter other params");
                    else {
                        this.result = params[0] / params[1];
                    }
                }
            }
            else {
                throw new UserException("you should enter params.");
            }
        }
    /*
     operation *
     */
    public void multi(int... params) throws UserException {
        if (params.length<1)
            throw new UserException("you should enter params.");
        if (result==0){
            result+=1;
            for (int param:params) {
                result *=param;
            }
        } else {
            for (int param:params) {
                result *= param;
            }
        }
    }
    /*
     set result 0
     */
    public void cleanResult (){
        this.result=0;
    }

    public int getResult() {
        return this.result;
    }
    /*
     select the desired operation
     */
        public void chooseOperation(String operation, int... params) throws UserException {
        if (operation.equals("plus")){
            add(params);
        }
        else if (operation.equals("minus")){
            minus(params);
        }
        else if (operation.equals("div")){
            div(params);
        }
        else if (operation.equals("multi")){
            multi(params);
        }
        else {
            throw new UserException("Please enter correct name of operation");
        }
    }
}

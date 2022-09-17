package dzSemOdinInkapsulyatsiya.Task05;

public class ComplexNumber {
    private double realDouble;

    private int realInt;

    private double imaginaryDouble;

    private int imaginaryInt;

    public ComplexNumber (double realDouble, double imaginaryDouble, int realInt, int imaginaryInt){
        this.realDouble = realDouble;
        this.imaginaryDouble = imaginaryDouble;
        this.realInt = realInt;
        this.imaginaryInt = imaginaryInt;
    }

    public void setRealDouble(double realDouble) {
        this.realDouble = realDouble;
    }

    public void setImaginary(double imaginaryDouble) {
        this.imaginaryDouble = imaginaryDouble;
    }

    public void setRealInt(int realInt) {
        this.realInt = realInt;
    }

    public void setImaginary(int imaginaryInt) {
        this.imaginaryInt = imaginaryInt;
    }

    public double getRealDouble() {
        return realDouble;
    }

    public double getImaginaryDouble() {
        return imaginaryDouble;
    }

    public double getRealInt() {
        return realInt;
    }

    public double getImaginaryInt() {
        return imaginaryInt;
    }

    public String printComplexNumber() {
        String answer;
        if(realDouble != 0) {
            answer = Double.toString(realDouble);
        } else {
            answer = Integer.toString(realInt);
        }
        if(imaginaryDouble != 0) {
            if(imaginaryDouble > 0) {
                answer = answer + "+" + Double.toString(imaginaryDouble) + "i";
            } else {
                answer = answer + Double.toString(imaginaryDouble) + "i";
            }
        } else {
            if (imaginaryInt >= 0) {
                answer = answer + "+" + Integer.toString(imaginaryInt) + "i";
            } else {
                answer = answer + Integer.toString(imaginaryInt) + "i";
            }
        }
        return answer;
    }

    public boolean comparison(ComplexNumber num2) {
        boolean equality = false;
        double realDouble1 = this.realDouble + this.realInt;
        double realDouble2 = num2.realDouble + num2.realInt;
        double imaginaryDouble1 = this.imaginaryDouble + this.imaginaryInt;
        double imaginaryDouble2 = num2.imaginaryDouble + num2.imaginaryInt;
        if(realDouble1 == realDouble2 && imaginaryDouble1 == imaginaryDouble2) {
            equality = true;
        }
        return  equality;
    }

    public ComplexNumber add(ComplexNumber num2) {
        double realDouble3 = 0;
        double imaginaryDouble3 = 0;
        int realInt3 = 0;
        int imaginaryInt3 = 0;

        if(this.realDouble == 0 && num2.realDouble ==0) {
            realInt3 = this.realInt + num2.realInt;
        } else {
            realDouble3 = this.realDouble + this.realInt + num2.realDouble + num2.realInt;
        }
        if(this.imaginaryDouble == 0 && num2.imaginaryDouble == 0) {
            imaginaryInt3 = this.imaginaryInt + num2.imaginaryInt;
        } else {
            imaginaryDouble3 = this.imaginaryDouble + num2.imaginaryDouble + this.imaginaryInt + num2.imaginaryInt;
        }
        return new ComplexNumber(realDouble3, imaginaryDouble3, realInt3, imaginaryInt3);
    }

    public ComplexNumber subtraction(ComplexNumber num2) {
        double realDouble3 = 0;
        double imaginaryDouble3 = 0;
        int realInt3 = 0;
        int imaginaryInt3 = 0;

        if(this.realDouble == 0 && num2.realDouble ==0) {
            realInt3 = this.realInt - num2.realInt;
        } else {
            realDouble3 = this.realDouble + this.realInt - num2.realDouble - num2.realInt;
        }
        if(this.imaginaryDouble == 0 && num2.imaginaryDouble == 0) {
            imaginaryInt3 = this.imaginaryInt - num2.imaginaryInt;
        } else {
            imaginaryDouble3 = this.imaginaryDouble - num2.imaginaryDouble + this.imaginaryInt - num2.imaginaryInt;
        }
        return new ComplexNumber(realDouble3, imaginaryDouble3, realInt3, imaginaryInt3);
    }

    public ComplexNumber multiplication(ComplexNumber num2) {
        double realDouble3 = 0;
        double imaginaryDouble3 = 0;
        int realInt3 = 0;
        int imaginaryInt3 = 0;
        if(this.realDouble == 0 && num2.realDouble == 0 && this.imaginaryDouble == 0 && num2.imaginaryDouble == 0) {
            realInt3 = this.realInt * num2.realInt - this.imaginaryInt * num2.imaginaryInt;
            imaginaryInt3 = this.imaginaryInt * num2.realInt + this.realInt * num2.imaginaryInt;
        } else {
            double real1 = this.realInt + this.realDouble;
            double imaginary1 = this.imaginaryInt + this.imaginaryDouble;
            double real2 = num2.realInt + num2.realDouble;
            double imaginary2 = num2.imaginaryInt + num2.imaginaryDouble;
            realDouble3 = real1 * real2 - imaginary1 * imaginary2;
            imaginaryDouble3 = imaginary1 * real2 + real1 * imaginary2;
        }
        return new ComplexNumber(realDouble3, imaginaryDouble3, realInt3, imaginaryInt3);
    }

}

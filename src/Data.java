/**
 * Created by Lais Lodi on 24/08/2017.
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(){}
    public Data(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);

        if (dia == 31){
            if (mes != 1 && mes != 3 && mes != 5 && mes != 7 && mes != 8 && mes != 10 && mes != 12){
                this.dia = -1;
            }
        }else if (dia > 28 && mes == 2 && ano%400 != 0){
            if (ano%100 == 0){
                this.dia = -1;
            }else{
                if (ano%4 != 0){
                    this.dia = -1;
                }
            }
        }

    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        if (dia < 1 || dia > 31){
            this.dia = -1;
        }else{
            this.dia = dia;
        }
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        if (mes < 1 || mes > 12){
            this.mes = -1;
        }else{
            this.mes = mes;
        }
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        if (ano < 1950){
            this.ano = 1950;
        }else{
            this.ano = ano;
        }
    }

    @Override
    public String toString(){
        String dataFormatada = "";
        if (dia > 0 && mes > 0 && ano > 0){
            if (dia < 10){
                dataFormatada = dataFormatada + "0" + this.dia + "/";
            }else{
                dataFormatada += this.dia + "/";
            }
            if (mes < 10) {
                dataFormatada = dataFormatada + "0" + this.mes + "/";
            }else{
                dataFormatada += this.mes + "/";
            }
            dataFormatada += this.ano;
        }
        return dataFormatada;
    }
}

package chapter.four;

public class Data{

        int dia;
        int mes;
        int ano;

        public String dataFormatada(int dia, int mes, int ano){


            String formatoData = this.dia + "/" + this.mes + "/" + this.ano;

            return formatoData;
        }
    }


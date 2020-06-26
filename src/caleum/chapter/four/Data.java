package chapter.four;

public class Data{

        private int dia;
        private int mes;
        private int ano;

        public String dataFormatada(int dia, int mes, int ano){


            String formatoData = this.dia + "/" + this.mes + "/" + this.ano;

            return formatoData;
        }
    }


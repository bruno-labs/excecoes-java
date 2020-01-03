import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
    private Integer NumeroSala;
    private Date checkIn;
    private Date checkOut;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva() {
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public Integer getNumeroSala() {
        return NumeroSala;
    }

    public void setNumeroSala(Integer numeroSala) {
        NumeroSala = numeroSala;
    }

    public long duracao(){
        long diferenca = checkOut.getTime() - checkIn.getTime();
        return  TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
    }

    public void atualizarDatas(Date checkIn, Date checkOut){
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString(){
        return "Sala" + getNumeroSala() + ", check-in " +
                sdf.format(checkIn) + " check-out " +
    }
}

import java.rmi.Remote;

/**
 * Interface dos métodos remotos.
 *
 * @author Erick
 */
public interface Dicionario extends Remote {

    public String traduzir(String palavra) throws java.rmi.RemoteException;

}
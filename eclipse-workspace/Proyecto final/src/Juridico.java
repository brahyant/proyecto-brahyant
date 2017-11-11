
public class Juridico {
private String RazonSocial;

public Juridico(String razonSocial) {
	super();
	RazonSocial = razonSocial;
}

public String getRazonSocial() {
	return RazonSocial;
}

public void setRazonSocial(String razonSocial) {
	RazonSocial = razonSocial;
}

@Override
public String toString() {
	return "Juridico [RazonSocial=" + RazonSocial + "]";
}

}

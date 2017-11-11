
public class Natural {
private String Patrimonio;

public Natural(String patrimonio) {
	super();
	Patrimonio = patrimonio;
}

public String getPatrimonio() {
	return Patrimonio;
}

public void setPatrimonio(String patrimonio) {
	Patrimonio = patrimonio;
}

@Override
public String toString() {
	return "Natural [Patrimonio=" + Patrimonio + "]";
}

}

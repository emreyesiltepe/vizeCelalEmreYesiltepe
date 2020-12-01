package tr.edu.medipol.yazilimaraclari.CelalEmreYesiltepe;

import org.junit.jupiter.api.Test;

import tr.edu.medipol.yazilimaraclari.CelalEmreYesiltepe.MuhasebeProgrami.Ucret;
 
class ucretiHesaplama {
	
	@Test
	public void ucretiHesapla() {
	
		
		
		Ucret sonuc = MuhasebeProgrami.ucretHesapla(61, 61);
        System.out.println("calisanin ucreti:"+sonuc);
		
		
		
	}

}

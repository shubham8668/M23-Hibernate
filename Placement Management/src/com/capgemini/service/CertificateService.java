package com.capgemini.service;

import com.capgemini.entities.Certificate;

public interface CertificateService 
{

	public abstract Certificate addCertificate(Certificate certificate);
	public abstract Certificate updateCertificate(Certificate certificate);
	public abstract Certificate deleteCertificate(int cert_id);
	public abstract Certificate searchCertificate(int cert_id);

}
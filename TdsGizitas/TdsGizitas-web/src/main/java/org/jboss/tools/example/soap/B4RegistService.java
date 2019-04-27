package org.jboss.tools.example.soap;

import java.sql.Date;

import javax.jws.WebParam;
import javax.jws.WebService;

import database_access.IdaApplFormInfoTblDao;
import database_access.IdaApplicationFormInfoTbl;


@WebService(serviceName = "B4RegistService")
public class B4RegistService {


    public B4RegistResponse hello(@WebParam(name="B4RegistRequest")B4RegistRequest b4RegistRequest) {

    	B4RegistResponse b4RegistResponse = new B4RegistResponse();

    	b4RegistResponse.setGroupId(b4RegistRequest.getGroupId());
    	b4RegistResponse.setApplicationTypeCode(b4RegistRequest.getApplicationTypeCode());
    	b4RegistResponse.setApplicationSubTypeCode(b4RegistRequest.getApplicationSubTypeCode());
    	b4RegistResponse.setReceptTypeCode(b4RegistRequest.getReceptTypeCode());


		IdaApplFormInfoTblDao dao = new IdaApplFormInfoTblDao();
		IdaApplicationFormInfoTbl idaApplicationFormInfoTbl = new IdaApplicationFormInfoTbl();

		idaApplicationFormInfoTbl.setApplicationFromNbr(b4RegistRequest.getGroupId());
		idaApplicationFormInfoTbl.setEntryDt(Date.valueOf("2019-02-01"));
		idaApplicationFormInfoTbl.setGroupId("2");


		dao.save(idaApplicationFormInfoTbl);

		b4RegistResponse.setResultMessage("正常終了");

    	return b4RegistResponse;
    }
}
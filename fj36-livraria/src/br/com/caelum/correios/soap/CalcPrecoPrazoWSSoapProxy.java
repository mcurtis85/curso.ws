package br.com.caelum.correios.soap;

public class CalcPrecoPrazoWSSoapProxy implements br.com.caelum.correios.soap.CalcPrecoPrazoWSSoap {
  private String _endpoint = null;
  private br.com.caelum.correios.soap.CalcPrecoPrazoWSSoap calcPrecoPrazoWSSoap = null;
  
  public CalcPrecoPrazoWSSoapProxy() {
    _initCalcPrecoPrazoWSSoapProxy();
  }
  
  public CalcPrecoPrazoWSSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalcPrecoPrazoWSSoapProxy();
  }
  
  private void _initCalcPrecoPrazoWSSoapProxy() {
    try {
      calcPrecoPrazoWSSoap = (new br.com.caelum.correios.soap.CalcPrecoPrazoWSLocator()).getCalcPrecoPrazoWSSoap();
      if (calcPrecoPrazoWSSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calcPrecoPrazoWSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calcPrecoPrazoWSSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calcPrecoPrazoWSSoap != null)
      ((javax.xml.rpc.Stub)calcPrecoPrazoWSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.caelum.correios.soap.CalcPrecoPrazoWSSoap getCalcPrecoPrazoWSSoap() {
    if (calcPrecoPrazoWSSoap == null)
      _initCalcPrecoPrazoWSSoapProxy();
    return calcPrecoPrazoWSSoap;
  }
  
  public br.com.caelum.correios.soap.CResultado calcPrecoPrazo(java.lang.String nCdEmpresa, java.lang.String sDsSenha, java.lang.String nCdServico, java.lang.String sCepOrigem, java.lang.String sCepDestino, java.lang.String nVlPeso, int nCdFormato, java.math.BigDecimal nVlComprimento, java.math.BigDecimal nVlAltura, java.math.BigDecimal nVlLargura, java.math.BigDecimal nVlDiametro, java.lang.String sCdMaoPropria, java.math.BigDecimal nVlValorDeclarado, java.lang.String sCdAvisoRecebimento) throws java.rmi.RemoteException{
    if (calcPrecoPrazoWSSoap == null)
      _initCalcPrecoPrazoWSSoapProxy();
    return calcPrecoPrazoWSSoap.calcPrecoPrazo(nCdEmpresa, sDsSenha, nCdServico, sCepOrigem, sCepDestino, nVlPeso, nCdFormato, nVlComprimento, nVlAltura, nVlLargura, nVlDiametro, sCdMaoPropria, nVlValorDeclarado, sCdAvisoRecebimento);
  }
  
  public br.com.caelum.correios.soap.CResultado calcPrecoPrazoData(java.lang.String nCdEmpresa, java.lang.String sDsSenha, java.lang.String nCdServico, java.lang.String sCepOrigem, java.lang.String sCepDestino, java.lang.String nVlPeso, int nCdFormato, java.math.BigDecimal nVlComprimento, java.math.BigDecimal nVlAltura, java.math.BigDecimal nVlLargura, java.math.BigDecimal nVlDiametro, java.lang.String sCdMaoPropria, java.math.BigDecimal nVlValorDeclarado, java.lang.String sCdAvisoRecebimento, java.lang.String sDtCalculo) throws java.rmi.RemoteException{
    if (calcPrecoPrazoWSSoap == null)
      _initCalcPrecoPrazoWSSoapProxy();
    return calcPrecoPrazoWSSoap.calcPrecoPrazoData(nCdEmpresa, sDsSenha, nCdServico, sCepOrigem, sCepDestino, nVlPeso, nCdFormato, nVlComprimento, nVlAltura, nVlLargura, nVlDiametro, sCdMaoPropria, nVlValorDeclarado, sCdAvisoRecebimento, sDtCalculo);
  }
  
  public br.com.caelum.correios.soap.CResultado calcPrecoPrazoRestricao(java.lang.String nCdEmpresa, java.lang.String sDsSenha, java.lang.String nCdServico, java.lang.String sCepOrigem, java.lang.String sCepDestino, java.lang.String nVlPeso, int nCdFormato, java.math.BigDecimal nVlComprimento, java.math.BigDecimal nVlAltura, java.math.BigDecimal nVlLargura, java.math.BigDecimal nVlDiametro, java.lang.String sCdMaoPropria, java.math.BigDecimal nVlValorDeclarado, java.lang.String sCdAvisoRecebimento, java.lang.String sDtCalculo) throws java.rmi.RemoteException{
    if (calcPrecoPrazoWSSoap == null)
      _initCalcPrecoPrazoWSSoapProxy();
    return calcPrecoPrazoWSSoap.calcPrecoPrazoRestricao(nCdEmpresa, sDsSenha, nCdServico, sCepOrigem, sCepDestino, nVlPeso, nCdFormato, nVlComprimento, nVlAltura, nVlLargura, nVlDiametro, sCdMaoPropria, nVlValorDeclarado, sCdAvisoRecebimento, sDtCalculo);
  }
  
  public br.com.caelum.correios.soap.CResultado calcPreco(java.lang.String nCdEmpresa, java.lang.String sDsSenha, java.lang.String nCdServico, java.lang.String sCepOrigem, java.lang.String sCepDestino, java.lang.String nVlPeso, int nCdFormato, java.math.BigDecimal nVlComprimento, java.math.BigDecimal nVlAltura, java.math.BigDecimal nVlLargura, java.math.BigDecimal nVlDiametro, java.lang.String sCdMaoPropria, java.math.BigDecimal nVlValorDeclarado, java.lang.String sCdAvisoRecebimento) throws java.rmi.RemoteException{
    if (calcPrecoPrazoWSSoap == null)
      _initCalcPrecoPrazoWSSoapProxy();
    return calcPrecoPrazoWSSoap.calcPreco(nCdEmpresa, sDsSenha, nCdServico, sCepOrigem, sCepDestino, nVlPeso, nCdFormato, nVlComprimento, nVlAltura, nVlLargura, nVlDiametro, sCdMaoPropria, nVlValorDeclarado, sCdAvisoRecebimento);
  }
  
  public br.com.caelum.correios.soap.CResultado calcPrecoData(java.lang.String nCdEmpresa, java.lang.String sDsSenha, java.lang.String nCdServico, java.lang.String sCepOrigem, java.lang.String sCepDestino, java.lang.String nVlPeso, int nCdFormato, java.math.BigDecimal nVlComprimento, java.math.BigDecimal nVlAltura, java.math.BigDecimal nVlLargura, java.math.BigDecimal nVlDiametro, java.lang.String sCdMaoPropria, java.math.BigDecimal nVlValorDeclarado, java.lang.String sCdAvisoRecebimento, java.lang.String sDtCalculo) throws java.rmi.RemoteException{
    if (calcPrecoPrazoWSSoap == null)
      _initCalcPrecoPrazoWSSoapProxy();
    return calcPrecoPrazoWSSoap.calcPrecoData(nCdEmpresa, sDsSenha, nCdServico, sCepOrigem, sCepDestino, nVlPeso, nCdFormato, nVlComprimento, nVlAltura, nVlLargura, nVlDiametro, sCdMaoPropria, nVlValorDeclarado, sCdAvisoRecebimento, sDtCalculo);
  }
  
  public br.com.caelum.correios.soap.CResultado calcPrazo(java.lang.String nCdServico, java.lang.String sCepOrigem, java.lang.String sCepDestino) throws java.rmi.RemoteException{
    if (calcPrecoPrazoWSSoap == null)
      _initCalcPrecoPrazoWSSoapProxy();
    return calcPrecoPrazoWSSoap.calcPrazo(nCdServico, sCepOrigem, sCepDestino);
  }
  
  public br.com.caelum.correios.soap.CResultado calcPrazoData(java.lang.String nCdServico, java.lang.String sCepOrigem, java.lang.String sCepDestino, java.lang.String sDtCalculo) throws java.rmi.RemoteException{
    if (calcPrecoPrazoWSSoap == null)
      _initCalcPrecoPrazoWSSoapProxy();
    return calcPrecoPrazoWSSoap.calcPrazoData(nCdServico, sCepOrigem, sCepDestino, sDtCalculo);
  }
  
  public br.com.caelum.correios.soap.CResultado calcPrazoRestricao(java.lang.String nCdServico, java.lang.String sCepOrigem, java.lang.String sCepDestino, java.lang.String sDtCalculo) throws java.rmi.RemoteException{
    if (calcPrecoPrazoWSSoap == null)
      _initCalcPrecoPrazoWSSoapProxy();
    return calcPrecoPrazoWSSoap.calcPrazoRestricao(nCdServico, sCepOrigem, sCepDestino, sDtCalculo);
  }
  
  public br.com.caelum.correios.soap.CResultado calcPrecoFAC(java.lang.String nCdServico, java.lang.String nVlPeso, java.lang.String strDataCalculo) throws java.rmi.RemoteException{
    if (calcPrecoPrazoWSSoap == null)
      _initCalcPrecoPrazoWSSoapProxy();
    return calcPrecoPrazoWSSoap.calcPrecoFAC(nCdServico, nVlPeso, strDataCalculo);
  }
  
  
}
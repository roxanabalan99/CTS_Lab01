package i.resolved;

public class CanonModelUltraPerforming implements IPrintTask, IScanTask,
IFaxTask, IPrintExternalDeviceTask, 
IBadgeAuthenticationTask{

	@Override
	public boolean authenticateBadge(String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean printContentExternalDevices(String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean faxContent(String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scanContent(String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean printContent(String content) {
		// TODO Auto-generated method stub
		return false;
	}

}

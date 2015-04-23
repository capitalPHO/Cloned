package com.adansoft.great21.controller.helpers;

import java.net.URI;

import org.springframework.web.client.RestTemplate;

import com.adansoft.great21.controllers.FacadeControllerURLs;
import com.adansoft.great21.dataaccess.schemas.GetActiveAddFriendList;
import com.adansoft.great21.dataaccess.schemas.GetActiveFriendRequest;
import com.adansoft.great21.dataaccess.schemas.GetActiveGameInviteList;
import com.adansoft.great21.dataaccess.schemas.GetActiveGameInviteRequest;
import com.adansoft.great21.dataaccess.schemas.GetActiveNotificationList;
import com.adansoft.great21.dataaccess.schemas.GetActiveNotificationRequest;
import com.adansoft.great21.dataaccess.schemas.GetFriendListResponse;
import com.adansoft.great21.dataaccess.schemas.GetFriendsListRequest;
import com.adansoft.great21.dataaccess.schemas.GetNotificationCountRequest;
import com.adansoft.great21.dataaccess.schemas.GetNotificationCountResponse;
import com.adansoft.great21.dataaccess.schemas.GetProfileInformationRequest;
import com.adansoft.great21.dataaccess.schemas.GetProfileInformationResponse;
import com.adansoft.great21.dataaccess.schemas.GetUserBasicDetailsRequest;
import com.adansoft.great21.dataaccess.schemas.GetUserBasicDetailsResponse;
import com.adansoft.great21.dataaccess.schemas.UpdateProfileInformationRequest;
import com.adansoft.great21.dataaccess.schemas.UserAuditRequest;
import com.adansoft.great21.router.FacadetoDataAccessMapper;

public class RestServiceHelper {

	public RestServiceHelper() {
		
	}

	public static GetUserBasicDetailsResponse getBasicDetails(FacadetoDataAccessMapper mapper,RestTemplate template,GetUserBasicDetailsRequest request)
	{
		GetUserBasicDetailsResponse response = null;
		try
		{
		URI url = new URI(mapper.getDataAccessURI() + "/"
				+ FacadeControllerURLs.DATAACCESS_BASE + "/"
				+ FacadeControllerURLs.BASIC_DETAILS);
		response = template.postForEntity(url, request, GetUserBasicDetailsResponse.class).getBody();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return response;
	}
	
	public static String insertAudit(FacadetoDataAccessMapper mapper,RestTemplate template,UserAuditRequest request)
	{
		String response = null;
		try
		{
		URI url = new URI(mapper.getDataAccessURI() + "/"
				+ FacadeControllerURLs.DATAACCESS_BASE + "/"
				+ FacadeControllerURLs.USER_AUDIT);
		response = template.postForEntity(url, request, String.class).getBody();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return response;
	}
	
	public static GetProfileInformationResponse getProfileInformation(FacadetoDataAccessMapper mapper,RestTemplate template,GetProfileInformationRequest request)
	{
		GetProfileInformationResponse response = null;
		try
		{
		URI url = new URI(mapper.getDataAccessURI() + "/"
				+ FacadeControllerURLs.DATAACCESS_BASE + "/"
				+ FacadeControllerURLs.USER_PROFILE_GET);
		response = template.postForEntity(url, request, GetProfileInformationResponse.class).getBody();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return response;
	}
	
	
	public static String updateProfileInformation(FacadetoDataAccessMapper mapper,RestTemplate template,UpdateProfileInformationRequest request)
	{
		String response = null;
		try
		{
		URI url = new URI(mapper.getDataAccessURI() + "/"
				+ FacadeControllerURLs.DATAACCESS_BASE + "/"
				+ FacadeControllerURLs.USER_PROFILE_UPDATE);
		response = template.postForEntity(url, request, String.class).getBody();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return response;
	}
	
	
	public static GetNotificationCountResponse getNotificationCount(FacadetoDataAccessMapper mapper,RestTemplate template,GetNotificationCountRequest request)
	{
		GetNotificationCountResponse response = null;
		try
		{
		URI url = new URI(mapper.getDataAccessURI() + "/"
				+ FacadeControllerURLs.DATAACCESS_BASE + "/"
				+ FacadeControllerURLs.GET_NOTIFICATION_COUNT);
		response = template.postForEntity(url, request, GetNotificationCountResponse.class).getBody();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return response;
	}
	
	public static GetActiveGameInviteList getActiveGameInvite(FacadetoDataAccessMapper mapper,RestTemplate template,GetActiveGameInviteRequest request)
	{
		GetActiveGameInviteList response = null;
		try
		{
		URI url = new URI(mapper.getDataAccessURI() + "/"
				+ FacadeControllerURLs.DATAACCESS_BASE + "/"
				+ FacadeControllerURLs.GET_ACTIVE_GAMEINVITE);
		response = template.postForEntity(url, request, GetActiveGameInviteList.class).getBody();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return response;
	}
	
	public static GetActiveAddFriendList getActiveAddFriendList(FacadetoDataAccessMapper mapper,RestTemplate template,GetActiveFriendRequest request)
	{
		GetActiveAddFriendList response = null;
		try
		{
		URI url = new URI(mapper.getDataAccessURI() + "/"
				+ FacadeControllerURLs.DATAACCESS_BASE + "/"
				+ FacadeControllerURLs.GET_ACTIVE_ADDFRIEND);
		response = template.postForEntity(url, request, GetActiveAddFriendList.class).getBody();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return response;
	}
	
	
	public static GetActiveNotificationList getActiveNotifications(FacadetoDataAccessMapper mapper,RestTemplate template,GetActiveNotificationRequest request)
	{
		GetActiveNotificationList response = null;
		try
		{
		URI url = new URI(mapper.getDataAccessURI() + "/"
				+ FacadeControllerURLs.DATAACCESS_BASE + "/"
				+ FacadeControllerURLs.GET_ACTIVE_NOTIFICATION);
		response = template.postForEntity(url, request, GetActiveNotificationList.class).getBody();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return response;
	}
	
	public static GetFriendListResponse getFriendsList(FacadetoDataAccessMapper mapper,RestTemplate template,GetFriendsListRequest request)
	{
		GetFriendListResponse response = null;
		try
		{
		URI url = new URI(mapper.getDataAccessURI() + "/"
				+ FacadeControllerURLs.DATAACCESS_BASE + "/"
				+ FacadeControllerURLs.GET_ACTIVE_NOTIFICATION);
		response = template.postForEntity(url, request, GetFriendListResponse.class).getBody();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return response;
	}
	
}

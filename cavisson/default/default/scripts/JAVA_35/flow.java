/*-----------------------------------------------------------------------------
    Name: flow
    Recorded By: cavisson
    Date of recording: 07/06/2021 02:43:55
    Flow details:
    Build details: 4.6.1 (build# 35)
    Modification History:
-----------------------------------------------------------------------------*/

package JAVA_35;
import pacJnvmApi.NSApi;

public class flow implements NsFlow
{
    public int execute(NSApi nsApi) throws Exception
    {
        int status = 0;

        status = nsApi.ns_start_transaction("index_html");
        status = nsApi.ns_web_url ("index_html",
            "URL=https://10.10.30.207:8443/tours/index.html",
            "HEADER=Upgrade-Insecure-Requests:1",
            "HEADER=Sec-Fetch-Site:none",
            "HEADER=Sec-Fetch-Mode:navigate",
            "HEADER=Sec-Fetch-User:?1",
            "HEADER=Sec-Fetch-Dest:document",
            "HEADER=Accept-Language:en-US,en;q=0.9",
            INLINE_URLS,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/banner_animated.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/sun_swede.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/login.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/images/banner_merctur.jpg", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE
        );

        status = nsApi.ns_end_transaction("index_html", NS_AUTO_STATUS);
    
   
        status = nsApi.ns_page_think_time(2.191);

        //Page Auto split for Image Link 'Login' Clicked by User
        status = nsApi.ns_start_transaction("login");
        status = nsApi.ns_web_url ("login",
            "URL=https://10.10.30.207:8443/cgi-bin/login?userSession=75893.0884568651DQADHfApHDHfcDtccpfAttcf&username=cavisson&password=cavisson&login.x=53&login.y=16&JSFormSubmit=off",
            "HEADER=Upgrade-Insecure-Requests:1",
            "HEADER=Sec-Fetch-Site:same-origin",
            "HEADER=Sec-Fetch-Mode:navigate",
            "HEADER=Sec-Fetch-User:?1",
            "HEADER=Sec-Fetch-Dest:document",
            "HEADER=Accept-Language:en-US,en;q=0.9",
            INLINE_URLS,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/banner_animated.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/sun_swede.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/flights.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/home.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/signoff.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/images/banner_merctur.jpg", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/vep/images/velocigen.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE
        );

        status = nsApi.ns_end_transaction("login", NS_AUTO_STATUS);
        status = nsApi.ns_page_think_time(3.546);

        //Page Auto split for Image Link 'Search Flights Button' Clicked by User
        status = nsApi.ns_start_transaction("reservation");
        status = nsApi.ns_web_url ("reservation",
            "URL=https://10.10.30.207:8443/cgi-bin/reservation",
            "HEADER=Upgrade-Insecure-Requests:1",
            "HEADER=Sec-Fetch-Site:same-origin",
            "HEADER=Sec-Fetch-Mode:navigate",
            "HEADER=Sec-Fetch-User:?1",
            "HEADER=Sec-Fetch-Dest:document",
            "HEADER=Accept-Language:en-US,en;q=0.9",
            INLINE_URLS,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/banner_animated.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/sun_swede.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/flights.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/home.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/signoff.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/splash_Findflight.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/images/continue.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/vep/images/velocigen.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE
        );

        status = nsApi.ns_end_transaction("reservation", NS_AUTO_STATUS);
        status = nsApi.ns_page_think_time(1.058);

        //Page Auto split for Image Link 'findFlights' Clicked by User
        status = nsApi.ns_start_transaction("findflight");
        status = nsApi.ns_web_url ("findflight",
            "URL=https://10.10.30.207:8443/cgi-bin/findflight?depart=Acapulco&departDate=07-07-2021&arrive=Acapulco&returnDate=07-08-2021&numPassengers=1&seatPref=None&seatType=Coach&findFlights.x=76&findFlights.y=16",
            "HEADER=Upgrade-Insecure-Requests:1",
            "HEADER=Sec-Fetch-Site:same-origin",
            "HEADER=Sec-Fetch-Mode:navigate",
            "HEADER=Sec-Fetch-User:?1",
            "HEADER=Sec-Fetch-Dest:document",
            "HEADER=Accept-Language:en-US,en;q=0.9",
            INLINE_URLS,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/banner_animated.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/sun_swede.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/flights.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/home.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/signoff.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/images/splash_Searchresults.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/images/continue.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/images/startover.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/vep/images/velocigen.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE
        );

        status = nsApi.ns_end_transaction("findflight", NS_AUTO_STATUS);
        status = nsApi.ns_page_think_time(0.996);

        //Page Auto split for Image Link 'reserveFlights' Clicked by User
        status = nsApi.ns_start_transaction("findflight_2");
        status = nsApi.ns_web_url ("findflight_2",
            "URL=https://10.10.30.207:8443/cgi-bin/findflight?outboundFlight=button0&hidden_outboundFlight_button0=000%7C0%7C07-07-2021&hidden_outboundFlight_button1=001%7C0%7C07-07-2021&hidden_outboundFlight_button2=002%7C0%7C07-07-2021&hidden_outboundFlight_button3=003%7C0%7C07-07-2021&numPassengers=1&advanceDiscount=&seatType=Coach&seatPref=None&reserveFlights.x=6&reserveFlights.y=16",
            "HEADER=Upgrade-Insecure-Requests:1",
            "HEADER=Sec-Fetch-Site:same-origin",
            "HEADER=Sec-Fetch-Mode:navigate",
            "HEADER=Sec-Fetch-User:?1",
            "HEADER=Sec-Fetch-Dest:document",
            "HEADER=Accept-Language:en-US,en;q=0.9",
            INLINE_URLS,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/banner_animated.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/sun_swede.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/flights.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/home.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/signoff.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/images/splash_creditcard.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/images/purchaseflight.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/images/startover.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/vep/images/velocigen.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE
        );

        status = nsApi.ns_end_transaction("findflight_2", NS_AUTO_STATUS);
        status = nsApi.ns_page_think_time(1.294);

        //Page Auto split for Image Link 'buyFlights' Clicked by User
        status = nsApi.ns_start_transaction("findflight_3");
        status = nsApi.ns_web_url ("findflight_3",
            "URL=https://10.10.30.207:8443/cgi-bin/findflight?firstName=Tiger&lastName=Scott&address1=4261+Stevenson+Blvd.&address2=Fremont%2C+CA+94538&pass1=Scott+Tiger&creditCard=&expDate=&oldCCOption=&numPassengers=1&seatType=Coach&seatPref=None&outboundFlight=000%7C0%7C07-07-2021&advanceDiscount=&buyFlights.x=36&buyFlights.y=10&.cgifields=saveCC",
            "HEADER=Upgrade-Insecure-Requests:1",
            "HEADER=Sec-Fetch-Site:same-origin",
            "HEADER=Sec-Fetch-Mode:navigate",
            "HEADER=Sec-Fetch-User:?1",
            "HEADER=Sec-Fetch-Dest:document",
            "HEADER=Accept-Language:en-US,en;q=0.9",
            INLINE_URLS,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/banner_animated.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/sun_swede.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/flights.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/home.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/signoff.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/images/splash_flightconfirm.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/images/bookanother.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/vep/images/velocigen.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE
        );

        status = nsApi.ns_end_transaction("findflight_3", NS_AUTO_STATUS);
        status = nsApi.ns_page_think_time(2.266);

        //Page Auto split for Image Link 'SignOff Button' Clicked by User
        status = nsApi.ns_start_transaction("welcome");
        status = nsApi.ns_web_url ("welcome",
            "URL=https://10.10.30.207:8443/cgi-bin/welcome",
            "HEADER=Upgrade-Insecure-Requests:1",
            "HEADER=Sec-Fetch-Site:same-origin",
            "HEADER=Sec-Fetch-Mode:navigate",
            "HEADER=Sec-Fetch-User:?1",
            "HEADER=Sec-Fetch-Dest:document",
            "HEADER=Accept-Language:en-US,en;q=0.9",
            INLINE_URLS,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/banner_animated.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/sun_swede.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/Merc10-dev/images/login.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/images/banner_merctur.jpg", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=https://10.10.30.207:8443/tours/vep/images/velocigen.gif", "HEADER=sec-ch-ua:\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"", "HEADER=sec-ch-ua-mobile:?0", "HEADER=Sec-Fetch-Site:same-origin", "HEADER=Sec-Fetch-Mode:no-cors", "HEADER=Sec-Fetch-Dest:image", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE
        );

        status = nsApi.ns_end_transaction("welcome", NS_AUTO_STATUS);
        status = nsApi.ns_page_think_time(0.952);

        return status;
    }
}

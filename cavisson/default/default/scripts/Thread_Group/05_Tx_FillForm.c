/*-----------------------------------------------------------------------------
    Name: 05_Tx_FillForm
    Generated By: cavisson
    Date of generation: 07/05/2021 04:14:34
    Flow details:
    Build details: 4.6.1 (build# 34)
    Modification History:
-----------------------------------------------------------------------------*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "ns_string.h"


void 05_Tx_FillForm()
{
    ns_start_transaction ("05_Tx_FillForm");
    ns_web_url ("findflight_2",
        "URL=http://184.105.48.40/cgi-bin/findflight?hidden_outboundFlight_button0=000%7C0%7C02-24-2018&outboundFlight=button1&hidden_outboundFlight_button1=001%7C0%7C02-24-2018&hidden_outboundFlight_button2=002%7C0%7C02-24-2018&hidden_outboundFlight_button3=003%7C0%7C02-24-2018&numPassengers=1&advanceDiscount=&seatType=Business&seatPref=Window&reserveFlights.x=63&reserveFlights.y=15",
        "METHOD=GET"
    );
    ns_end_transaction ("05_Tx_FillForm", NS_AUTO_STATUS);
    ns_page_think_time(3.0);


}
/*-----------------------------------------------------------------------------
    Name: 03_Tx_SearchFlight
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


void 03_Tx_SearchFlight()
{
    ns_start_transaction ("03_Tx_SearchFlight");
    ns_web_url ("reservation",
        "URL=http://184.105.48.40/cgi-bin/reservation",
        "METHOD=GET"
    );
    ns_end_transaction ("03_Tx_SearchFlight", NS_AUTO_STATUS);
    ns_page_think_time(3.0);


}
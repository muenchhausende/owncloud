<?php

/**
 * ownCloud - roundcube mail plugin
 *
 * @author Martin Reinhardt 
 * @copyright 2013 Martin Reinhardt contact@martinreinhardt-online.de
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU AFFERO GENERAL PUBLIC LICENSE
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU AFFERO GENERAL PUBLIC LICENSE for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

class OC_RoundCube_App_Login  {

	public static $ERROC_CODE_NETWORK = '2';

	public static $ERROC_CODE_LOGIN = '1';

	public $errorOccurred;

	public $errorCode;

	public $errorDetails;

	public $htmlOutput;

}
?>
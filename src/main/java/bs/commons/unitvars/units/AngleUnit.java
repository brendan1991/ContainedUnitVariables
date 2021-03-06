package bs.commons.unitvars.units;

import bs.commons.unitvars.core.UnitConversionMap;
import bs.commons.unitvars.core.UnitGroup;
import bs.commons.unitvars.core.UnitType;
import bs.commons.unitvars.core.UnitData.Unit;

public enum AngleUnit implements Unit
{

	RADIAN(
		"Radian",
		"rad"),
	DEGREE(
		"Degree",
		"deg");

	private AngleUnit(String unit_name, String unit_abbreviation)
	{
		Unit.newUnitDetails(unit_name, unit_abbreviation, this, UnitType.ANGLE);
	}

	@Override
	public UnitConversionMap getConversionMap()
	{

		UnitConversionMap map = new UnitConversionMap();

		map.addConversions(AngleUnit.RADIAN, 1.0, 360.0 / (2 * Math.PI));
		map.addConversions(AngleUnit.DEGREE, (2 * Math.PI) / 360, 1.0);

		return map;
	}

	@Override
	public UnitGroup getGroup()
	{
		return UnitType.ANGLE;
	}

}

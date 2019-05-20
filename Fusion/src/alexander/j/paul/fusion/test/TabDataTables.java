package alexander.j.paul.fusion.test;

import utils.Collections.Table;

/**
 * Contains all the processed Tab data for the chart/table data.
 * To avoid file/path/API issues. I parsed and formatted the txt files and hard coded it into the Program.
 * @author Alexander Paul
 *
 */
public final class TabDataTables {

	private final static Table MAX_OGE_GOOD = getTable(new float[][]{
		   {220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 219.0f, 211.0f},
		   {220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 214.0f, 207.0f},
		   {220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 216.0f, 210.0f, 203.0f},
		   {220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 218.0f, 212.0f, 206.0f, 199.0f},
		   {220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 219.0f, 214.0f, 208.0f, 202.0f, 195.0f},
		   {220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 215.0f, 210.0f, 204.0f, 198.0f, Float.NaN},
		   {220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 216.0f, 211.0f, 206.0f, 200.0f, Float.NaN, Float.NaN},
		   {220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 219.0f, 216.0f, 212.0f, 207.0f, 202.0f, 197.0f, Float.NaN, Float.NaN},
		   {220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 217.0f, 215.0f, 212.0f, 208.0f, 203.0f, 198.0f, 193.0f, Float.NaN, Float.NaN},
		   {220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 219.0f, 217.5f, 216.0f, 213.0f, 211.0f, 208.0f, 204.0f, 199.0f, 194.0f, 189.0f, Float.NaN, Float.NaN},
		   {220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 218.0f, 215.0f, 212.0f, 209.0f, 207.0f, 204.0f, 200.0f, 196.0f, 190.0f, 185.0f, Float.NaN, Float.NaN},
		   {217.0f, 217.0f, 217.0f, 217.0f, 217.0f, 217.0f, 217.0f, 218.0f, 217.0f, 214.0f, 211.0f, 208.0f, 205.0f, 203.0f, 200.0f, 196.0f, 192.0f, 187.0f, Float.NaN, Float.NaN, Float.NaN},
		   {213.0f, 213.0f, 213.0f, 213.0f, 213.0f, 213.0f, 213.0f, 214.0f, 213.0f, 210.0f, 207.0f, 204.0f, 202.0f, 199.0f, 196.0f, 192.0f, 188.0f, 183.0f, 178.0f, Float.NaN, Float.NaN},
		   {209.0f, 209.0f, 209.0f, 209.0f, 209.0f, 209.0f, 209.0f, 210.0f, 209.0f, 206.0f, 204.0f, 201.0f, 198.0f, 195.0f, 192.0f, 189.0f, 184.0f, 179.0f, 174.0f, Float.NaN, Float.NaN},
		   {205.0f, 205.0f, 205.0f, 206.0f, 205.0f, 205.0f, 206.0f, 206.0f, 205.0f, 202.0f, 200.0f, 197.0f, 194.0f, 191.0f, 189.0f, 185.0f, 181.0f, 176.0f, Float.NaN, Float.NaN, Float.NaN},
		   {202.0f, 201.0f, 201.0f, 202.0f, 201.0f, 201.0f, 202.0f, 202.0f, 201.0f, 198.0f, 196.0f, 193.0f, 190.0f, 188.0f, 185.0f, 181.0f, 177.0f, 172.0f, Float.NaN, Float.NaN, Float.NaN},
		   {198.0f, 198.0f, 198.0f, 198.0f, 197.0f, 198.0f, 198.0f, 199.0f, 197.0f, 194.0f, 192.0f, 189.0f, 186.0f, 184.0f, 181.0f, 178.0f, 173.0f, 169.0f, Float.NaN, Float.NaN, Float.NaN},
		   {194.0f, 194.0f, 194.0f, 194.0f, 194.0f, 194.0f, 194.0f, 195.0f, 193.0f, 191.0f, 188.0f, 185.0f, 183.0f, 180.0f, 178.0f, 174.0f, 170.0f, 165.0f, Float.NaN, Float.NaN, Float.NaN},
		   {191.0f, 190.0f, 190.0f, 191.0f, 190.0f, 190.0f, 191.0f, 191.0f, 190.0f, 187.0f, 184.0f, 182.0f, 179.0f, 177.0f, 174.0f, 171.0f, 166.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {187.0f, 187.0f, 187.0f, 187.0f, 187.0f, 187.0f, 187.0f, 187.0f, 186.0f, 183.0f, 181.0f, 178.0f, 176.0f, 173.0f, 170.0f, 167.0f, 163.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {183.0f, 183.0f, 183.0f, 183.0f, 183.0f, 183.0f, 183.0f, 184.0f, 182.0f, 180.0f, 177.0f, 175.0f, 172.0f, 170.0f, 167.0f, 163.0f, 159.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {180.0f, 180.0f, 180.0f, 180.0f, 180.0f, 180.0f, 180.0f, 180.0f, 179.0f, 176.0f, 174.0f, 171.0f, 169.0f, 166.0f, 164.0f, 160.0f, 156.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {176.0f, 176.0f, 176.0f, 176.0f, 176.0f, 176.0f, 176.0f, 177.0f, 175.0f, 173.0f, 170.0f, 168.0f, 165.0f, 163.0f, 160.0f, 157.0f, 153.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {173.0f, 173.0f, 173.0f, 173.0f, 173.0f, 173.0f, 173.0f, 173.0f, 173.0f, 173.0f, 173.0f, 164.0f, 162.0f, 160.0f, 157.0f, 153.0f, 150.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {170.0f, 170.0f, 169.0f, 170.0f, 169.0f, 169.0f, 170.0f, 170.0f, 169.0f, 169.0f, 170.0f, 161.0f, 159.0f, 156.0f, 154.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {166.0f, 166.0f, 166.0f, 166.0f, 166.0f, 166.0f, 166.0f, 166.0f, 166.0f, 166.0f, 166.0f, 158.0f, 155.0f, 153.0f, 151.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {163.0f, 163.0f, 163.0f, 163.0f, 163.0f, 163.0f, 163.0f, 163.0f, 163.0f, 163.0f, 163.0f, 155.0f, 152.0f, 150.0f, 147.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {160.0f, 160.0f, 160.0f, 160.0f, 159.0f, 160.0f, 160.0f, 160.0f, 159.0f, 160.0f, 160.0f, 152.0f, 149.0f, 147.0f, 144.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {157.0f, 157.0f, 156.0f, 156.0f, 156.0f, 156.0f, 157.0f, 156.0f, 156.0f, 156.0f, 157.0f, 149.0f, 146.0f, 144.0f, 141.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {154.0f, 153.0f, 153.0f, 153.0f, 153.0f, 153.0f, 154.0f, 153.0f, 153.0f, 153.0f, 154.0f, 146.0f, 143.0f, 141.0f, 138.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {151.0f, 150.0f, 150.0f, 150.0f, 150.0f, 150.0f, 151.0f, 150.0f, 150.0f, 150.0f, 151.0f, 143.0f, 140.0f, 138.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {148.0f, 147.0f, 147.0f, 147.0f, 147.0f, 147.0f, 148.0f, 147.0f, 147.0f, 147.0f, 148.0f, 140.0f, 137.0f, 135.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, 137.0f, 134.0f, 132.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN}
		});
	private final static Table MAX_OGE_BAD = getTable(new float[][] {
		   {220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 216.0f, 210.0f, 204.0f, 197.0f},
		   {220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 218.0f, 212.0f, 206.0f, 200.0f, 193.0f},
		   {220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 214.0f, 208.0f, 202.0f, 196.0f, 189.0f},
		   {220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 219.0f, 216.0f, 210.0f, 204.0f, 199.0f, 193.0f, 186.0f},
		   {220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 218.0f, 212.0f, 206.0f, 200.0f, 195.0f, 189.0f, 182.0f},
		   {220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 219.0f, 217.0f, 214.0f, 208.0f, 202.0f, 197.0f, 191.0f, 185.0f, Float.NaN},
		   {220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 218.0f, 214.0f, 210.0f, 204.0f, 198.0f, 193.0f, 187.0f, Float.NaN, Float.NaN},
		   {220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 219.0f, 218.0f, 214.0f, 210.0f, 206.0f, 200.0f, 194.0f, 189.0f, 184.0f, Float.NaN, Float.NaN},
		   {220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 220.0f, 218.0f, 214.0f, 210.0f, 206.0f, 202.0f, 197.0f, 191.0f, 185.0f, 180.0f, Float.NaN, Float.NaN},
		   {219.0f, 218.5f, 218.5f, 219.0f, 218.5f, 218.5f, 219.0f, 219.0f, 218.5f, 217.0f, 214.0f, 210.0f, 206.0f, 202.0f, 198.0f, 193.0f, 187.0f, 182.0f, 177.0f, Float.NaN, Float.NaN},
		   {218.0f, 217.0f, 217.0f, 218.0f, 217.0f, 217.0f, 218.0f, 218.0f, 217.0f, 214.0f, 210.0f, 206.0f, 202.0f, 199.0f, 194.0f, 189.0f, 183.0f, 178.0f, 173.0f, Float.NaN, Float.NaN},
		   {214.0f, 213.0f, 213.0f, 214.0f, 213.0f, 213.0f, 214.0f, 214.0f, 213.0f, 210.0f, 206.0f, 203.0f, 199.0f, 195.0f, 190.0f, 185.0f, 180.0f, 175.0f, Float.NaN, Float.NaN, Float.NaN},
		   {210.0f, 209.0f, 209.0f, 210.0f, 209.0f, 209.0f, 210.0f, 210.0f, 209.0f, 206.0f, 203.0f, 199.0f, 195.0f, 191.0f, 187.0f, 182.0f, 176.0f, 171.0f, 166.0f, Float.NaN, Float.NaN},
		   {206.0f, 206.0f, 206.0f, 206.0f, 205.0f, 205.0f, 206.0f, 207.0f, 205.0f, 202.0f, 199.0f, 195.0f, 191.0f, 187.0f, 183.0f, 178.0f, 173.0f, 168.0f, 163.0f, Float.NaN, Float.NaN},
		   {202.0f, 202.0f, 202.0f, 202.0f, 201.0f, 202.0f, 202.0f, 203.0f, 202.0f, 198.0f, 195.0f, 191.0f, 187.0f, 184.0f, 180.0f, 174.0f, 169.0f, 164.0f, Float.NaN, Float.NaN, Float.NaN},
		   {198.0f, 198.0f, 198.0f, 198.0f, 198.0f, 198.0f, 198.0f, 199.0f, 198.0f, 195.0f, 191.0f, 187.0f, 184.0f, 180.0f, 176.0f, 171.0f, 166.0f, 161.0f, Float.NaN, Float.NaN, Float.NaN},
		   {195.0f, 194.0f, 194.0f, 194.0f, 194.0f, 194.0f, 195.0f, 195.0f, 194.0f, 191.0f, 187.0f, 184.0f, 180.0f, 176.0f, 173.0f, 168.0f, 162.0f, 158.0f, Float.NaN, Float.NaN, Float.NaN},
		   {191.0f, 191.0f, 191.0f, 191.0f, 190.0f, 191.0f, 191.0f, 192.0f, 190.0f, 187.0f, 184.0f, 180.0f, 177.0f, 173.0f, 169.0f, 164.0f, 159.0f, 154.0f, Float.NaN, Float.NaN, Float.NaN},
		   {187.0f, 187.0f, 187.0f, 187.0f, 187.0f, 187.0f, 187.0f, 188.0f, 186.0f, 183.0f, 180.0f, 177.0f, 173.0f, 170.0f, 166.0f, 161.0f, 156.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {184.0f, 184.0f, 184.0f, 184.0f, 183.0f, 184.0f, 184.0f, 184.0f, 183.0f, 180.0f, 177.0f, 173.0f, 170.0f, 166.0f, 162.0f, 158.0f, 152.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {180.0f, 180.0f, 180.0f, 180.0f, 180.0f, 180.0f, 180.0f, 181.0f, 179.0f, 176.0f, 173.0f, 170.0f, 166.0f, 163.0f, 159.0f, 154.0f, 149.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {177.0f, 177.0f, 177.0f, 177.0f, 176.0f, 177.0f, 177.0f, 177.0f, 176.0f, 173.0f, 170.0f, 166.0f, 163.0f, 159.0f, 156.0f, 151.0f, 146.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {174.0f, 173.0f, 173.0f, 173.0f, 173.0f, 173.0f, 173.0f, 174.0f, 172.0f, 169.0f, 166.0f, 163.0f, 160.0f, 156.0f, 153.0f, 148.0f, 143.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {170.0f, 170.0f, 170.0f, 170.0f, 170.0f, 170.0f, 170.0f, 170.0f, 170.0f, 170.0f, 170.0f, 160.0f, 157.0f, 153.0f, 149.0f, 145.0f, 140.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {167.0f, 167.0f, 167.0f, 167.0f, 166.0f, 166.0f, 167.0f, 167.0f, 166.0f, 166.0f, 167.0f, 157.0f, 153.0f, 150.0f, 146.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {164.0f, 164.0f, 163.0f, 163.0f, 163.0f, 163.0f, 164.0f, 163.0f, 163.0f, 163.0f, 164.0f, 153.0f, 150.0f, 147.0f, 143.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {160.0f, 160.0f, 160.0f, 160.0f, 160.0f, 160.0f, 161.0f, 160.0f, 160.0f, 160.0f, 161.0f, 150.0f, 147.0f, 144.0f, 140.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {157.0f, 157.0f, 157.0f, 157.0f, 157.0f, 157.0f, 157.0f, 157.0f, 157.0f, 157.0f, 157.0f, 147.0f, 144.0f, 141.0f, 137.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {154.0f, 154.0f, 154.0f, 154.0f, 154.0f, 154.0f, 154.0f, 154.0f, 154.0f, 154.0f, 154.0f, 144.0f, 141.0f, 138.0f, 134.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {151.0f, 151.0f, 151.0f, 151.0f, 151.0f, 151.0f, 151.0f, 151.0f, 151.0f, 151.0f, 151.0f, 141.0f, 138.0f, 135.0f, 132.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {148.0f, 148.0f, 148.0f, 148.0f, 148.0f, 148.0f, 148.0f, 148.0f, 148.0f, 148.0f, 148.0f, 138.0f, 135.0f, 132.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {145.0f, 145.0f, 145.0f, 145.0f, 145.0f, 145.0f, 146.0f, 145.0f, 145.0f, 145.0f, 146.0f, 136.0f, 133.0f, 130.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, 133.0f, 130.0f, 127.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN}
		});
	
	private final static Table TRQ_OGE_GOOD = getTable(new float[][] {
		   {97.0f, 98.0f, 99.0f, 99.0f, 100.0f, 101.0f, 101.0f, 102.0f, 102.0f, 103.0f, 104.0f, 105.0f, 105.0f, 106.0f, 106.0f, 107.0f, 108.0f, 109.0f, 110.0f, 109.0f, 104.0f},
		   {98.0f, 98.5f, 99.5f, 100.0f, 100.5f, 101.5f, 102.0f, 103.0f, 103.0f, 104.0f, 105.0f, 105.5f, 106.0f, 107.0f, 107.5f, 108.0f, 109.0f, 110.0f, 111.0f, 107.0f, 102.0f},
		   {99.0f, 99.0f, 100.0f, 101.0f, 101.0f, 102.0f, 103.0f, 104.0f, 104.0f, 105.0f, 106.0f, 106.0f, 107.0f, 108.0f, 109.0f, 109.0f, 110.0f, 111.0f, 109.0f, 105.0f, 100.0f},
		   {99.5f, 100.0f, 101.0f, 102.0f, 102.0f, 103.0f, 104.0f, 105.0f, 105.0f, 106.0f, 107.0f, 107.0f, 108.0f, 109.0f, 110.0f, 111.0f, 112.0f, 111.0f, 107.0f, 103.0f, 98.0f},
		   {100.0f, 101.0f, 102.0f, 103.0f, 103.0f, 104.0f, 105.0f, 106.0f, 106.0f, 107.0f, 108.0f, 108.0f, 109.0f, 110.0f, 111.0f, 112.0f, 113.0f, 109.0f, 105.0f, 101.0f, 96.0f},
		   {101.0f, 102.0f, 103.0f, 104.0f, 104.5f, 105.0f, 106.0f, 107.0f, 107.0f, 108.0f, 109.0f, 109.5f, 110.5f, 111.5f, 112.5f, 113.0f, 110.0f, 107.0f, 103.0f, 99.0f, Float.NaN},
		   {102.0f, 103.0f, 104.0f, 105.0f, 106.0f, 106.0f, 107.0f, 108.0f, 108.0f, 109.0f, 110.0f, 111.0f, 112.0f, 113.0f, 114.0f, 112.0f, 108.0f, 105.0f, 101.0f, Float.NaN, Float.NaN},
		   {103.0f, 104.0f, 105.0f, 106.0f, 107.0f, 107.5f, 108.0f, 109.0f, 109.5f, 110.5f, 111.5f, 112.0f, 113.0f, 113.0f, 112.0f, 110.0f, 106.0f, 103.0f, 99.0f, Float.NaN, Float.NaN},
		   {104.0f, 105.0f, 106.0f, 107.0f, 108.0f, 109.0f, 109.0f, 110.0f, 111.0f, 112.0f, 113.0f, 114.0f, 113.0f, 111.0f, 110.0f, 107.0f, 104.0f, 100.0f, 97.0f, Float.NaN, Float.NaN},
		   {105.5f, 106.5f, 107.5f, 108.5f, 109.5f, 110.0f, 110.5f, 111.5f, 112.5f, 112.5f, 112.5f, 112.0f, 110.0f, 109.0f, 107.0f, 105.0f, 102.0f, 99.0f, 95.0f, Float.NaN, Float.NaN},
		   {107.0f, 108.0f, 109.0f, 110.0f, 111.0f, 111.0f, 112.0f, 113.0f, 114.0f, 113.0f, 112.0f, 110.0f, 108.0f, 107.0f, 105.0f, 103.0f, 100.0f, 97.0f, 93.0f, Float.NaN, Float.NaN},
		   {106.0f, 107.0f, 108.0f, 109.0f, 109.0f, 110.0f, 111.0f, 113.0f, 113.0f, 111.0f, 110.0f, 108.0f, 106.0f, 105.0f, 103.0f, 101.0f, 98.0f, 95.0f, Float.NaN, Float.NaN, Float.NaN},
		   {104.0f, 105.0f, 106.0f, 107.0f, 107.0f, 108.0f, 109.0f, 111.0f, 111.0f, 109.0f, 108.0f, 106.0f, 104.0f, 103.0f, 101.0f, 99.0f, 96.0f, 93.0f, 89.0f, Float.NaN, Float.NaN},
		   {102.0f, 103.0f, 104.0f, 105.0f, 105.0f, 106.0f, 107.0f, 109.0f, 109.0f, 107.0f, 106.0f, 104.0f, 102.0f, 101.0f, 99.0f, 97.0f, 94.0f, 91.0f, 87.0f, Float.NaN, Float.NaN},
		   {101.0f, 101.0f, 102.0f, 103.0f, 103.0f, 104.0f, 105.0f, 107.0f, 107.0f, 105.0f, 104.0f, 102.0f, 100.0f, 99.0f, 97.0f, 95.0f, 92.0f, 89.0f, Float.NaN, Float.NaN, Float.NaN},
		   {99.0f, 99.0f, 100.0f, 101.0f, 101.0f, 102.0f, 103.0f, 105.0f, 105.0f, 103.0f, 102.0f, 100.0f, 98.0f, 97.0f, 95.0f, 93.0f, 90.0f, 87.0f, Float.NaN, Float.NaN, Float.NaN},
		   {97.0f, 98.0f, 98.0f, 99.0f, 100.0f, 100.0f, 102.0f, 103.0f, 102.0f, 101.0f, 99.0f, 98.0f, 96.0f, 95.0f, 93.0f, 91.0f, 88.0f, 85.0f, Float.NaN, Float.NaN, Float.NaN},
		   {95.0f, 96.0f, 97.0f, 98.0f, 98.0f, 99.0f, 100.0f, 101.0f, 100.0f, 99.0f, 98.0f, 96.0f, 94.0f, 93.0f, 91.0f, 89.0f, 86.0f, 83.0f, Float.NaN, Float.NaN, Float.NaN},
		   {93.0f, 94.0f, 95.0f, 96.0f, 96.0f, 97.0f, 98.0f, 99.0f, 98.0f, 97.0f, 96.0f, 94.0f, 92.0f, 91.0f, 89.0f, 87.0f, 84.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {92.0f, 92.0f, 93.0f, 94.0f, 94.0f, 95.0f, 96.0f, 97.0f, 96.0f, 95.0f, 94.0f, 92.0f, 90.0f, 89.0f, 88.0f, 85.0f, 83.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {90.0f, 91.0f, 91.0f, 92.0f, 92.0f, 93.0f, 94.0f, 95.0f, 94.0f, 93.0f, 92.0f, 90.0f, 89.0f, 87.0f, 86.0f, 83.0f, 81.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {88.0f, 89.0f, 90.0f, 90.0f, 91.0f, 91.0f, 92.0f, 93.0f, 93.0f, 91.0f, 90.0f, 88.0f, 87.0f, 85.0f, 84.0f, 82.0f, 79.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {87.0f, 87.0f, 88.0f, 89.0f, 89.0f, 90.0f, 90.0f, 92.0f, 91.0f, 89.0f, 88.0f, 87.0f, 85.0f, 84.0f, 82.0f, 80.0f, 77.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {85.0f, 86.0f, 86.0f, 87.0f, 87.0f, 88.0f, 89.0f, 87.0f, 87.0f, 88.0f, 89.0f, 85.0f, 83.0f, 82.0f, 80.0f, 78.0f, 75.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {83.0f, 84.0f, 84.0f, 85.0f, 85.0f, 86.0f, 87.0f, 85.0f, 85.0f, 86.0f, 87.0f, 83.0f, 82.0f, 80.0f, 79.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {82.0f, 82.0f, 83.0f, 83.0f, 84.0f, 85.0f, 85.0f, 83.0f, 84.0f, 85.0f, 85.0f, 81.0f, 80.0f, 79.0f, 77.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {80.0f, 81.0f, 81.0f, 82.0f, 82.0f, 83.0f, 84.0f, 82.0f, 82.0f, 83.0f, 84.0f, 80.0f, 78.0f, 77.0f, 75.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {78.0f, 79.0f, 79.0f, 80.0f, 80.0f, 81.0f, 82.0f, 80.0f, 80.0f, 81.0f, 82.0f, 78.0f, 77.0f, 75.0f, 74.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {77.0f, 77.0f, 78.0f, 78.0f, 79.0f, 80.0f, 81.0f, 78.0f, 79.0f, 80.0f, 81.0f, 76.0f, 75.0f, 74.0f, 72.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {75.0f, 76.0f, 76.0f, 77.0f, 77.0f, 78.0f, 79.0f, 77.0f, 77.0f, 78.0f, 79.0f, 75.0f, 73.0f, 72.0f, 70.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {74.0f, 74.0f, 75.0f, 75.0f, 76.0f, 76.0f, 78.0f, 75.0f, 76.0f, 76.0f, 78.0f, 73.0f, 72.0f, 71.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {72.0f, 73.0f, 73.0f, 74.0f, 74.0f, 75.0f, 76.0f, 74.0f, 74.0f, 75.0f, 76.0f, 72.0f, 70.0f, 69.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, 70.0f, 69.0f, 68.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN}
		});
	
	protected final static Table TRQ_OGE_BAD = getTable(new float[][] {
		   {97.0f, 98.0f, 99.0f, 99.0f, 100.0f, 101.0f, 101.0f, 102.0f, 102.0f, 103.0f, 104.0f, 105.0f, 105.0f, 106.0f, 106.0f, 107.0f, 108.0f, 106.0f, 102.0f, 98.0f, 94.0f},
		   {98.0f, 98.5f, 99.5f, 100.0f, 100.5f, 101.5f, 102.0f, 103.0f, 103.0f, 104.0f, 105.0f, 105.5f, 106.0f, 107.0f, 107.5f, 108.0f, 107.0f, 104.0f, 100.0f, 97.0f, 92.0f},
		   {99.0f, 99.0f, 100.0f, 101.0f, 101.0f, 102.0f, 103.0f, 104.0f, 104.0f, 105.0f, 106.0f, 106.0f, 107.0f, 108.0f, 109.0f, 109.0f, 105.0f, 102.0f, 98.0f, 95.0f, 90.0f},
		   {99.5f, 100.0f, 101.0f, 102.0f, 102.0f, 103.0f, 104.0f, 105.0f, 105.0f, 106.0f, 107.0f, 107.0f, 108.0f, 109.0f, 109.0f, 108.0f, 103.0f, 100.0f, 96.0f, 93.0f, 89.0f},
		   {100.0f, 101.0f, 102.0f, 103.0f, 103.0f, 104.0f, 105.0f, 106.0f, 106.0f, 107.0f, 108.0f, 108.0f, 109.0f, 110.0f, 109.0f, 105.0f, 101.0f, 98.0f, 95.0f, 91.0f, 87.0f},
		   {101.0f, 102.0f, 103.0f, 104.0f, 104.5f, 105.0f, 106.0f, 107.0f, 107.0f, 108.0f, 109.0f, 109.5f, 109.5f, 109.0f, 107.0f, 104.0f, 99.0f, 96.0f, 93.0f, 89.0f, Float.NaN},
		   {102.0f, 103.0f, 104.0f, 105.0f, 106.0f, 106.0f, 107.0f, 108.0f, 108.0f, 109.0f, 110.0f, 111.0f, 110.0f, 108.0f, 105.0f, 102.0f, 97.0f, 94.0f, 91.0f, Float.NaN, Float.NaN},
		   {103.0f, 104.0f, 105.0f, 106.0f, 107.0f, 107.5f, 108.0f, 109.0f, 109.5f, 110.5f, 110.5f, 111.0f, 108.0f, 106.0f, 103.0f, 100.0f, 96.0f, 92.0f, 89.0f, Float.NaN, Float.NaN},
		   {104.0f, 105.0f, 106.0f, 107.0f, 108.0f, 109.0f, 109.0f, 110.0f, 111.0f, 112.0f, 111.0f, 109.0f, 106.0f, 104.0f, 101.0f, 98.0f, 94.0f, 90.0f, 87.0f, Float.NaN, Float.NaN},
		   {104.5f, 105.5f, 106.5f, 107.5f, 108.0f, 109.0f, 109.5f, 111.0f, 111.5f, 111.0f, 109.0f, 107.0f, 104.0f, 102.0f, 99.0f, 96.0f, 92.0f, 89.0f, 85.0f, Float.NaN, Float.NaN},
		   {105.0f, 106.0f, 107.0f, 108.0f, 108.0f, 109.0f, 110.0f, 112.0f, 112.0f, 110.0f, 107.0f, 105.0f, 102.0f, 100.0f, 97.0f, 94.0f, 90.0f, 87.0f, 84.0f, Float.NaN, Float.NaN},
		   {103.0f, 104.0f, 105.0f, 106.0f, 106.0f, 107.0f, 108.0f, 110.0f, 110.0f, 108.0f, 105.0f, 103.0f, 100.0f, 98.0f, 95.0f, 92.0f, 88.0f, 85.0f, Float.NaN, Float.NaN, Float.NaN},
		   {101.0f, 102.0f, 103.0f, 104.0f, 104.0f, 105.0f, 106.0f, 108.0f, 108.0f, 106.0f, 103.0f, 101.0f, 98.0f, 96.0f, 93.0f, 90.0f, 86.0f, 83.0f, 80.0f, Float.NaN, Float.NaN},
		   {100.0f, 100.0f, 101.0f, 102.0f, 102.0f, 103.0f, 104.0f, 106.0f, 106.0f, 104.0f, 101.0f, 99.0f, 96.0f, 94.0f, 91.0f, 88.0f, 85.0f, 82.0f, 79.0f, Float.NaN, Float.NaN},
		   {98.0f, 98.0f, 99.0f, 100.0f, 100.0f, 101.0f, 102.0f, 104.0f, 104.0f, 102.0f, 99.0f, 97.0f, 95.0f, 92.0f, 90.0f, 86.0f, 83.0f, 80.0f, Float.NaN, Float.NaN, Float.NaN},
		   {96.0f, 97.0f, 97.0f, 98.0f, 99.0f, 99.0f, 101.0f, 102.0f, 102.0f, 100.0f, 97.0f, 95.0f, 93.0f, 90.0f, 88.0f, 85.0f, 81.0f, 78.0f, Float.NaN, Float.NaN, Float.NaN},
		   {94.0f, 95.0f, 96.0f, 96.0f, 97.0f, 98.0f, 99.0f, 100.0f, 100.0f, 98.0f, 95.0f, 93.0f, 91.0f, 88.0f, 86.0f, 83.0f, 79.0f, 76.0f, Float.NaN, Float.NaN, Float.NaN},
		   {92.0f, 93.0f, 94.0f, 95.0f, 95.0f, 96.0f, 97.0f, 98.0f, 98.0f, 96.0f, 94.0f, 91.0f, 89.0f, 87.0f, 84.0f, 81.0f, 78.0f, 75.0f, Float.NaN, Float.NaN, Float.NaN},
		   {91.0f, 91.0f, 92.0f, 93.0f, 93.0f, 94.0f, 95.0f, 96.0f, 96.0f, 94.0f, 92.0f, 89.0f, 87.0f, 85.0f, 83.0f, 79.0f, 76.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {89.0f, 90.0f, 90.0f, 91.0f, 91.0f, 92.0f, 93.0f, 94.0f, 94.0f, 92.0f, 90.0f, 88.0f, 85.0f, 83.0f, 81.0f, 78.0f, 74.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {87.0f, 88.0f, 89.0f, 89.0f, 90.0f, 90.0f, 91.0f, 92.0f, 92.0f, 90.0f, 88.0f, 86.0f, 84.0f, 81.0f, 79.0f, 76.0f, 73.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {86.0f, 86.0f, 87.0f, 88.0f, 88.0f, 89.0f, 90.0f, 91.0f, 90.0f, 88.0f, 86.0f, 84.0f, 82.0f, 80.0f, 77.0f, 74.0f, 71.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {84.0f, 85.0f, 85.0f, 86.0f, 86.0f, 87.0f, 88.0f, 89.0f, 88.0f, 86.0f, 85.0f, 82.0f, 80.0f, 78.0f, 76.0f, 73.0f, 69.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {82.0f, 83.0f, 84.0f, 84.0f, 85.0f, 85.0f, 86.0f, 84.0f, 85.0f, 85.0f, 86.0f, 81.0f, 79.0f, 76.0f, 74.0f, 71.0f, 68.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {81.0f, 81.0f, 82.0f, 83.0f, 83.0f, 84.0f, 84.0f, 83.0f, 83.0f, 84.0f, 84.0f, 79.0f, 77.0f, 75.0f, 73.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {79.0f, 80.0f, 80.0f, 81.0f, 81.0f, 82.0f, 83.0f, 81.0f, 81.0f, 82.0f, 83.0f, 77.0f, 75.0f, 73.0f, 71.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {78.0f, 78.0f, 79.0f, 79.0f, 80.0f, 80.0f, 81.0f, 79.0f, 80.0f, 80.0f, 81.0f, 76.0f, 74.0f, 72.0f, 69.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {76.0f, 77.0f, 77.0f, 78.0f, 78.0f, 79.0f, 80.0f, 78.0f, 78.0f, 79.0f, 80.0f, 74.0f, 72.0f, 70.0f, 68.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {75.0f, 75.0f, 76.0f, 76.0f, 77.0f, 77.0f, 78.0f, 76.0f, 77.0f, 77.0f, 78.0f, 73.0f, 71.0f, 69.0f, 66.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {73.0f, 74.0f, 74.0f, 75.0f, 75.0f, 76.0f, 77.0f, 75.0f, 75.0f, 76.0f, 77.0f, 71.0f, 69.0f, 67.0f, 65.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {72.0f, 72.0f, 73.0f, 73.0f, 74.0f, 74.0f, 75.0f, 73.0f, 74.0f, 74.0f, 75.0f, 70.0f, 68.0f, 66.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {70.0f, 71.0f, 71.0f, 72.0f, 72.0f, 73.0f, 74.0f, 72.0f, 72.0f, 73.0f, 74.0f, 68.0f, 66.0f, 64.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, 67.0f, 65.0f, 63.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN}
		});
	
	private final static Table TRQ_IGE_GOOD = getTable(new float[][]{
		   {84.0f, 85.0f, 85.0f, 85.0f, 86.0f, 86.0f, 87.0f, 87.0f, 88.0f, 88.0f, 89.0f, 89.0f, 90.0f, 90.0f, 91.0f, 91.0f, 92.0f, 93.0f, 93.0f, 93.0f, 89.0f},
		   {84.5f, 85.0f, 85.5f, 85.5f, 86.5f, 86.5f, 87.5f, 87.5f, 88.5f, 88.5f, 89.5f, 89.5f, 90.5f, 91.0f, 91.5f, 92.0f, 93.0f, 94.0f, 94.0f, 91.0f, 88.0f},
		   {85.0f, 85.0f, 86.0f, 86.0f, 87.0f, 87.0f, 88.0f, 88.0f, 89.0f, 89.0f, 90.0f, 90.0f, 91.0f, 92.0f, 92.0f, 93.0f, 94.0f, 94.0f, 93.0f, 90.0f, 86.0f},
		   {85.5f, 85.5f, 86.0f, 86.5f, 87.0f, 87.5f, 88.5f, 88.5f, 89.5f, 89.5f, 90.5f, 91.0f, 91.5f, 92.5f, 93.0f, 94.0f, 94.0f, 94.0f, 91.0f, 88.0f, 84.0f},
		   {86.0f, 86.0f, 86.0f, 87.0f, 87.0f, 88.0f, 89.0f, 89.0f, 90.0f, 90.0f, 91.0f, 92.0f, 92.0f, 93.0f, 94.0f, 94.0f, 95.0f, 92.0f, 89.0f, 86.0f, 82.0f},
		   {86.0f, 86.5f, 86.5f, 87.5f, 87.5f, 88.5f, 89.5f, 89.5f, 90.5f, 91.0f, 91.5f, 92.5f, 93.0f, 94.0f, 94.5f, 95.0f, 93.0f, 90.0f, 87.0f, 84.0f, Float.NaN},
		   {86.0f, 87.0f, 87.0f, 88.0f, 88.0f, 89.0f, 90.0f, 90.0f, 91.0f, 92.0f, 92.0f, 93.0f, 94.0f, 95.0f, 95.0f, 94.0f, 91.0f, 89.0f, 86.0f, Float.NaN, Float.NaN},
		   {86.5f, 87.5f, 87.5f, 88.5f, 89.0f, 89.5f, 90.5f, 91.0f, 91.5f, 92.5f, 93.0f, 94.0f, 95.0f, 95.0f, 94.0f, 92.0f, 89.0f, 87.0f, 84.0f, Float.NaN, Float.NaN},
		   {87.0f, 88.0f, 88.0f, 89.0f, 90.0f, 90.0f, 91.0f, 92.0f, 92.0f, 93.0f, 94.0f, 95.0f, 94.0f, 93.0f, 92.0f, 90.0f, 88.0f, 85.0f, 82.0f, Float.NaN, Float.NaN},
		   {87.5f, 88.5f, 88.5f, 89.5f, 90.5f, 91.0f, 91.5f, 92.5f, 93.0f, 93.5f, 93.5f, 93.0f, 92.0f, 91.0f, 90.0f, 88.0f, 86.0f, 83.0f, 81.0f, Float.NaN, Float.NaN},
		   {88.0f, 89.0f, 89.0f, 90.0f, 91.0f, 92.0f, 92.0f, 93.0f, 94.0f, 94.0f, 93.0f, 92.0f, 90.0f, 89.0f, 88.0f, 87.0f, 84.0f, 82.0f, 79.0f, Float.NaN, Float.NaN},
		   {87.0f, 88.0f, 88.0f, 89.0f, 90.0f, 91.0f, 92.0f, 93.0f, 93.0f, 92.0f, 91.0f, 90.0f, 89.0f, 88.0f, 87.0f, 85.0f, 83.0f, 80.0f, Float.NaN, Float.NaN, Float.NaN},
		   {86.0f, 86.0f, 87.0f, 88.0f, 88.0f, 89.0f, 90.0f, 91.0f, 91.0f, 90.0f, 89.0f, 88.0f, 87.0f, 86.0f, 85.0f, 83.0f, 81.0f, 78.0f, 76.0f, Float.NaN, Float.NaN},
		   {84.0f, 85.0f, 85.0f, 86.0f, 86.0f, 87.0f, 88.0f, 89.0f, 89.0f, 88.0f, 88.0f, 86.0f, 85.0f, 84.0f, 83.0f, 82.0f, 79.0f, 77.0f, 74.0f, Float.NaN, Float.NaN},
		   {83.0f, 83.0f, 84.0f, 84.0f, 85.0f, 86.0f, 87.0f, 88.0f, 88.0f, 87.0f, 86.0f, 85.0f, 84.0f, 83.0f, 82.0f, 80.0f, 78.0f, 75.0f, Float.NaN, Float.NaN, Float.NaN},
		   {81.0f, 82.0f, 82.0f, 83.0f, 83.0f, 84.0f, 85.0f, 86.0f, 86.0f, 85.0f, 84.0f, 83.0f, 82.0f, 81.0f, 80.0f, 78.0f, 76.0f, 74.0f, Float.NaN, Float.NaN, Float.NaN},
		   {79.0f, 80.0f, 81.0f, 81.0f, 82.0f, 82.0f, 83.0f, 85.0f, 84.0f, 83.0f, 82.0f, 81.0f, 80.0f, 79.0f, 78.0f, 77.0f, 74.0f, 72.0f, Float.NaN, Float.NaN, Float.NaN},
		   {78.0f, 79.0f, 79.0f, 80.0f, 80.0f, 81.0f, 82.0f, 83.0f, 83.0f, 82.0f, 81.0f, 80.0f, 79.0f, 78.0f, 77.0f, 75.0f, 73.0f, 71.0f, Float.NaN, Float.NaN, Float.NaN},
		   {77.0f, 77.0f, 78.0f, 78.0f, 79.0f, 79.0f, 80.0f, 81.0f, 81.0f, 80.0f, 79.0f, 78.0f, 77.0f, 76.0f, 75.0f, 73.0f, 71.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {75.0f, 76.0f, 76.0f, 77.0f, 77.0f, 78.0f, 79.0f, 80.0f, 79.0f, 79.0f, 78.0f, 77.0f, 76.0f, 75.0f, 74.0f, 72.0f, 70.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {74.0f, 74.0f, 75.0f, 75.0f, 76.0f, 76.0f, 77.0f, 78.0f, 78.0f, 77.0f, 76.0f, 75.0f, 74.0f, 73.0f, 72.0f, 70.0f, 68.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {72.0f, 73.0f, 73.0f, 74.0f, 74.0f, 75.0f, 76.0f, 77.0f, 76.0f, 75.0f, 75.0f, 74.0f, 73.0f, 72.0f, 71.0f, 69.0f, 67.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {71.0f, 71.0f, 72.0f, 73.0f, 73.0f, 74.0f, 74.0f, 75.0f, 75.0f, 74.0f, 73.0f, 72.0f, 71.0f, 70.0f, 69.0f, 67.0f, 65.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {70.0f, 70.0f, 70.0f, 71.0f, 71.0f, 72.0f, 73.0f, 71.0f, 71.0f, 72.0f, 73.0f, 71.0f, 70.0f, 69.0f, 68.0f, 66.0f, 64.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {68.0f, 69.0f, 69.0f, 70.0f, 70.0f, 71.0f, 71.0f, 70.0f, 70.0f, 71.0f, 71.0f, 69.0f, 68.0f, 67.0f, 66.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {67.0f, 67.0f, 68.0f, 68.0f, 69.0f, 69.0f, 70.0f, 68.0f, 69.0f, 69.0f, 70.0f, 68.0f, 67.0f, 66.0f, 65.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {66.0f, 66.0f, 66.0f, 67.0f, 67.0f, 68.0f, 69.0f, 67.0f, 67.0f, 68.0f, 69.0f, 66.0f, 65.0f, 65.0f, 63.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {64.0f, 65.0f, 65.0f, 66.0f, 66.0f, 67.0f, 68.0f, 66.0f, 66.0f, 67.0f, 68.0f, 65.0f, 64.0f, 63.0f, 62.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {63.0f, 63.0f, 64.0f, 64.0f, 65.0f, 65.0f, 66.0f, 64.0f, 65.0f, 65.0f, 66.0f, 64.0f, 63.0f, 62.0f, 61.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {62.0f, 62.0f, 62.0f, 63.0f, 63.0f, 64.0f, 65.0f, 63.0f, 63.0f, 64.0f, 65.0f, 62.0f, 61.0f, 61.0f, 59.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {61.0f, 61.0f, 61.0f, 62.0f, 62.0f, 63.0f, 64.0f, 62.0f, 62.0f, 63.0f, 64.0f, 61.0f, 60.0f, 59.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {59.0f, 60.0f, 60.0f, 60.0f, 61.0f, 61.0f, 62.0f, 60.0f, 61.0f, 61.0f, 62.0f, 60.0f, 59.0f, 58.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, 59.0f, 58.0f, 57.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN}
		});
	private final static Table TRQ_IGE_BAD = getTable(new float[][] {
		   {84.0f, 85.0f, 85.0f, 85.0f, 86.0f, 86.0f, 87.0f, 87.0f, 88.0f, 88.0f, 89.0f, 89.0f, 90.0f, 90.0f, 91.0f, 91.0f, 92.0f, 90.0f, 87.0f, 84.0f, 81.0f},
		   {84.5f, 85.0f, 85.5f, 85.5f, 86.5f, 86.5f, 87.5f, 87.5f, 88.5f, 88.5f, 89.5f, 89.5f, 90.5f, 91.0f, 91.5f, 92.0f, 91.0f, 89.0f, 86.0f, 83.0f, 79.0f},
		   {85.0f, 85.0f, 86.0f, 86.0f, 87.0f, 87.0f, 88.0f, 88.0f, 89.0f, 89.0f, 90.0f, 90.0f, 91.0f, 92.0f, 92.0f, 93.0f, 90.0f, 87.0f, 84.0f, 81.0f, 78.0f},
		   {85.5f, 85.5f, 86.0f, 86.5f, 87.0f, 87.5f, 88.5f, 88.5f, 89.5f, 89.5f, 90.5f, 91.0f, 91.5f, 92.5f, 92.0f, 91.0f, 88.0f, 85.0f, 83.0f, 80.0f, 76.0f},
		   {86.0f, 86.0f, 86.0f, 87.0f, 87.0f, 88.0f, 89.0f, 89.0f, 90.0f, 90.0f, 91.0f, 92.0f, 92.0f, 93.0f, 92.0f, 90.0f, 86.0f, 84.0f, 81.0f, 78.0f, 75.0f},
		   {86.0f, 86.5f, 86.5f, 87.5f, 87.5f, 88.5f, 89.5f, 89.5f, 90.5f, 91.0f, 91.5f, 92.5f, 92.5f, 92.0f, 90.5f, 88.0f, 85.0f, 82.0f, 79.0f, 76.0f, Float.NaN},
		   {86.0f, 87.0f, 87.0f, 88.0f, 88.0f, 89.0f, 90.0f, 90.0f, 91.0f, 92.0f, 92.0f, 93.0f, 93.0f, 91.0f, 89.0f, 86.0f, 83.0f, 81.0f, 78.0f, Float.NaN, Float.NaN},
		   {86.5f, 87.5f, 87.5f, 88.5f, 89.0f, 89.5f, 90.5f, 91.0f, 91.5f, 92.5f, 92.5f, 93.0f, 91.0f, 89.0f, 87.0f, 85.0f, 81.0f, 79.0f, 76.0f, Float.NaN, Float.NaN},
		   {87.0f, 88.0f, 88.0f, 89.0f, 90.0f, 90.0f, 91.0f, 92.0f, 92.0f, 93.0f, 93.0f, 91.0f, 89.0f, 88.0f, 86.0f, 83.0f, 80.0f, 77.0f, 75.0f, Float.NaN, Float.NaN},
		   {87.0f, 87.5f, 88.0f, 89.0f, 89.5f, 90.0f, 91.0f, 92.0f, 92.0f, 92.0f, 91.5f, 89.0f, 88.0f, 86.0f, 84.0f, 81.0f, 78.0f, 76.0f, 73.0f, Float.NaN, Float.NaN},
		   {87.0f, 87.0f, 88.0f, 89.0f, 89.0f, 90.0f, 91.0f, 92.0f, 92.0f, 91.0f, 90.0f, 88.0f, 86.0f, 84.0f, 82.0f, 80.0f, 77.0f, 74.0f, 72.0f, Float.NaN, Float.NaN},
		   {85.0f, 86.0f, 86.0f, 87.0f, 88.0f, 88.0f, 89.0f, 91.0f, 91.0f, 89.0f, 88.0f, 86.0f, 84.0f, 83.0f, 81.0f, 78.0f, 75.0f, 73.0f, Float.NaN, Float.NaN, Float.NaN},
		   {84.0f, 84.0f, 85.0f, 86.0f, 86.0f, 87.0f, 88.0f, 89.0f, 89.0f, 88.0f, 86.0f, 85.0f, 83.0f, 81.0f, 79.0f, 77.0f, 74.0f, 71.0f, 69.0f, Float.NaN, Float.NaN},
		   {82.0f, 83.0f, 83.0f, 84.0f, 84.0f, 85.0f, 86.0f, 87.0f, 87.0f, 86.0f, 85.0f, 83.0f, 81.0f, 79.0f, 78.0f, 75.0f, 72.0f, 70.0f, 67.0f, Float.NaN, Float.NaN},
		   {81.0f, 81.0f, 82.0f, 82.0f, 83.0f, 84.0f, 85.0f, 86.0f, 86.0f, 84.0f, 83.0f, 81.0f, 80.0f, 78.0f, 76.0f, 74.0f, 71.0f, 68.0f, Float.NaN, Float.NaN, Float.NaN},
		   {79.0f, 80.0f, 80.0f, 81.0f, 81.0f, 82.0f, 83.0f, 84.0f, 84.0f, 83.0f, 81.0f, 80.0f, 78.0f, 76.0f, 74.0f, 72.0f, 69.0f, 67.0f, Float.NaN, Float.NaN, Float.NaN},
		   {78.0f, 78.0f, 79.0f, 79.0f, 80.0f, 80.0f, 81.0f, 83.0f, 82.0f, 81.0f, 80.0f, 78.0f, 76.0f, 75.0f, 73.0f, 70.0f, 68.0f, 65.0f, Float.NaN, Float.NaN, Float.NaN},
		   {76.0f, 77.0f, 77.0f, 78.0f, 78.0f, 79.0f, 80.0f, 81.0f, 81.0f, 80.0f, 78.0f, 77.0f, 75.0f, 73.0f, 71.0f, 69.0f, 66.0f, 64.0f, Float.NaN, Float.NaN, Float.NaN},
		   {75.0f, 75.0f, 76.0f, 76.0f, 77.0f, 78.0f, 78.0f, 79.0f, 79.0f, 78.0f, 77.0f, 75.0f, 73.0f, 72.0f, 70.0f, 68.0f, 65.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {73.0f, 74.0f, 74.0f, 75.0f, 75.0f, 76.0f, 77.0f, 78.0f, 78.0f, 76.0f, 75.0f, 73.0f, 72.0f, 70.0f, 69.0f, 66.0f, 63.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {72.0f, 72.0f, 73.0f, 74.0f, 74.0f, 75.0f, 75.0f, 76.0f, 76.0f, 75.0f, 73.0f, 72.0f, 70.0f, 69.0f, 67.0f, 65.0f, 62.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {71.0f, 71.0f, 72.0f, 72.0f, 73.0f, 73.0f, 74.0f, 75.0f, 75.0f, 73.0f, 72.0f, 71.0f, 69.0f, 67.0f, 66.0f, 63.0f, 61.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {69.0f, 70.0f, 70.0f, 71.0f, 71.0f, 72.0f, 73.0f, 74.0f, 73.0f, 72.0f, 71.0f, 69.0f, 68.0f, 66.0f, 64.0f, 62.0f, 59.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {68.0f, 68.0f, 69.0f, 69.0f, 70.0f, 70.0f, 71.0f, 69.0f, 70.0f, 70.0f, 71.0f, 68.0f, 66.0f, 65.0f, 63.0f, 61.0f, 58.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {67.0f, 67.0f, 68.0f, 68.0f, 68.0f, 69.0f, 70.0f, 68.0f, 68.0f, 69.0f, 70.0f, 66.0f, 65.0f, 63.0f, 62.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {65.0f, 66.0f, 66.0f, 67.0f, 67.0f, 68.0f, 68.0f, 67.0f, 67.0f, 68.0f, 68.0f, 65.0f, 64.0f, 62.0f, 60.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {64.0f, 65.0f, 65.0f, 65.0f, 66.0f, 66.0f, 67.0f, 65.0f, 66.0f, 66.0f, 67.0f, 64.0f, 62.0f, 61.0f, 59.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {63.0f, 63.0f, 64.0f, 64.0f, 64.0f, 65.0f, 66.0f, 64.0f, 64.0f, 65.0f, 66.0f, 62.0f, 61.0f, 59.0f, 58.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {62.0f, 62.0f, 62.0f, 63.0f, 63.0f, 64.0f, 65.0f, 63.0f, 63.0f, 64.0f, 65.0f, 61.0f, 60.0f, 58.0f, 56.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {60.0f, 61.0f, 61.0f, 62.0f, 62.0f, 62.0f, 63.0f, 62.0f, 62.0f, 62.0f, 63.0f, 60.0f, 58.0f, 57.0f, 55.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {59.0f, 60.0f, 60.0f, 60.0f, 61.0f, 61.0f, 62.0f, 60.0f, 61.0f, 61.0f, 62.0f, 59.0f, 57.0f, 56.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {58.0f, 58.0f, 59.0f, 59.0f, 59.0f, 60.0f, 61.0f, 59.0f, 59.0f, 60.0f, 61.0f, 57.0f, 56.0f, 55.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN},
		   {Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, 56.0f, 55.0f, 53.0f, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN}
		});

	private final static Table MAX_TRQ_GOOD = getTable(new float[][] {
		   {129.0f, 130.0f, 131.0f, 132.0f, 133.0f, 134.0f, 135.0f, 136.0f, 138.0f, 137.0f, 136.0f, 134.0f, 132.0f, 131.0f, 129.0f, 127.0f, 125.0f, 121.0f, 117.0f, 113.0f, 109.0f},
		   {127.0f, 128.0f, 129.0f, 130.0f, 131.0f, 131.0f, 132.0f, 134.0f, 135.0f, 135.0f, 134.0f, 132.0f, 130.0f, 128.0f, 127.0f, 125.0f, 123.0f, 119.0f, 115.0f, 111.0f, 107.0f},
		   {124.0f, 125.0f, 126.0f, 127.0f, 128.0f, 129.0f, 130.0f, 131.0f, 133.0f, 132.0f, 131.0f, 130.0f, 128.0f, 126.0f, 124.0f, 122.0f, 120.0f, 117.0f, 113.0f, 109.0f, 105.0f},
		   {122.0f, 123.0f, 124.0f, 125.0f, 126.0f, 127.0f, 128.0f, 129.0f, 131.0f, 130.0f, 129.0f, 127.0f, 125.0f, 124.0f, 122.0f, 120.0f, 118.0f, 114.0f, 111.0f, 107.0f, 103.0f},
		   {120.0f, 121.0f, 122.0f, 123.0f, 124.0f, 125.0f, 125.0f, 127.0f, 128.0f, 127.0f, 127.0f, 125.0f, 123.0f, 121.0f, 120.0f, 118.0f, 116.0f, 112.0f, 109.0f, 105.0f, 101.0f},
		   {118.0f, 119.0f, 120.0f, 121.0f, 122.0f, 122.0f, 123.0f, 124.0f, 126.0f, 125.0f, 124.0f, 123.0f, 121.0f, 119.0f, 118.0f, 116.0f, 114.0f, 110.0f, 107.0f, 103.0f, 99.0f},
		   {116.0f, 117.0f, 118.0f, 119.0f, 120.0f, 120.0f, 121.0f, 122.0f, 124.0f, 123.0f, 122.0f, 120.0f, 119.0f, 117.0f, 116.0f, 114.0f, 112.0f, 108.0f, 105.0f, 101.0f, 97.0f},
		   {114.0f, 114.0f, 115.0f, 116.0f, 117.0f, 118.0f, 119.0f, 120.0f, 122.0f, 121.0f, 120.0f, 118.0f, 116.0f, 115.0f, 113.0f, 111.0f, 109.0f, 106.0f, 102.0f, 99.0f, 95.0f},
		   {112.0f, 112.0f, 113.0f, 114.0f, 115.0f, 116.0f, 117.0f, 118.0f, 119.0f, 119.0f, 118.0f, 116.0f, 114.0f, 113.0f, 111.0f, 109.0f, 107.0f, 104.0f, 100.0f, 97.0f, 93.0f},
		   {110.0f, 110.0f, 111.0f, 112.0f, 113.0f, 114.0f, 115.0f, 116.0f, 117.0f, 116.0f, 115.0f, 114.0f, 112.0f, 111.0f, 109.0f, 107.0f, 105.0f, 102.0f, 98.0f, 95.0f, 91.0f},
		   {108.0f, 108.0f, 109.0f, 110.0f, 111.0f, 112.0f, 112.0f, 114.0f, 115.0f, 114.0f, 113.0f, 112.0f, 110.0f, 109.0f, 107.0f, 105.0f, 103.0f, 100.0f, 96.0f, 93.0f, 89.0f},
		   {106.0f, 106.0f, 107.0f, 108.0f, 109.0f, 110.0f, 110.0f, 112.0f, 113.0f, 112.0f, 111.0f, 110.0f, 108.0f, 106.0f, 105.0f, 103.0f, 101.0f, 98.0f, 94.0f, 91.0f, 87.0f},
		   {104.0f, 104.0f, 105.0f, 106.0f, 107.0f, 108.0f, 108.0f, 110.0f, 111.0f, 110.0f, 109.0f, 108.0f, 106.0f, 104.0f, 103.0f, 101.0f, 99.0f, 96.0f, 92.0f, 89.0f, 85.0f},
		   {102.0f, 103.0f, 103.0f, 104.0f, 105.0f, 106.0f, 106.0f, 108.0f, 109.0f, 108.0f, 107.0f, 105.0f, 104.0f, 102.0f, 101.0f, 99.0f, 97.0f, 94.0f, 90.0f, 87.0f, 83.0f},
		   {100.0f, 101.0f, 101.0f, 102.0f, 103.0f, 104.0f, 104.0f, 106.0f, 107.0f, 106.0f, 105.0f, 103.0f, 102.0f, 100.0f, 99.0f, 97.0f, 95.0f, 92.0f, 89.0f, 85.0f, 82.0f},
		   {98.0f, 99.0f, 100.0f, 100.0f, 101.0f, 102.0f, 102.0f, 104.0f, 105.0f, 104.0f, 103.0f, 101.0f, 100.0f, 98.0f, 97.0f, 95.0f, 93.0f, 90.0f, 87.0f, 83.0f, 80.0f},
		   {96.0f, 97.0f, 98.0f, 99.0f, 99.0f, 100.0f, 101.0f, 102.0f, 103.0f, 102.0f, 101.0f, 99.0f, 98.0f, 96.0f, 95.0f, 93.0f, 91.0f, 88.0f, 85.0f, 81.0f, 78.0f},
		   {94.0f, 95.0f, 96.0f, 97.0f, 98.0f, 98.0f, 99.0f, 100.0f, 101.0f, 100.0f, 99.0f, 97.0f, 96.0f, 94.0f, 93.0f, 91.0f, 89.0f, 86.0f, 83.0f, 80.0f, 76.0f},
		   {93.0f, 93.0f, 94.0f, 95.0f, 96.0f, 96.0f, 97.0f, 98.0f, 99.0f, 98.0f, 97.0f, 95.0f, 94.0f, 92.0f, 91.0f, 89.0f, 87.0f, 84.0f, 81.0f, 78.0f, 74.0f},
		   {91.0f, 92.0f, 92.0f, 93.0f, 94.0f, 94.0f, 95.0f, 96.0f, 97.0f, 96.0f, 95.0f, 93.0f, 92.0f, 91.0f, 89.0f, 87.0f, 85.0f, 82.0f, 79.0f, 76.0f, 73.0f},
		   {89.0f, 90.0f, 91.0f, 91.0f, 92.0f, 93.0f, 93.0f, 94.0f, 95.0f, 94.0f, 93.0f, 92.0f, 90.0f, 89.0f, 87.0f, 85.0f, 83.0f, 80.0f, 78.0f, 74.0f, 71.0f},
		   {88.0f, 88.0f, 89.0f, 90.0f, 90.0f, 91.0f, 91.0f, 92.0f, 94.0f, 92.0f, 91.0f, 90.0f, 88.0f, 87.0f, 85.0f, 84.0f, 82.0f, 79.0f, 76.0f, 73.0f, 69.0f},
		   {86.0f, 87.0f, 87.0f, 88.0f, 89.0f, 89.0f, 90.0f, 91.0f, 92.0f, 91.0f, 89.0f, 88.0f, 87.0f, 85.0f, 84.0f, 82.0f, 80.0f, 77.0f, 74.0f, 71.0f, 68.0f},
		   {84.0f, 85.0f, 86.0f, 86.0f, 87.0f, 87.0f, 88.0f, 89.0f, 90.0f, 89.0f, 88.0f, 86.0f, 85.0f, 83.0f, 82.0f, 80.0f, 78.0f, 75.0f, 72.0f, 69.0f, 66.0f},
		   {83.0f, 83.0f, 84.0f, 85.0f, 85.0f, 86.0f, 86.0f, 87.0f, 88.0f, 87.0f, 86.0f, 84.0f, 83.0f, 82.0f, 80.0f, 78.0f, 76.0f, 74.0f, 71.0f, 68.0f, 64.0f},
		   {81.0f, 82.0f, 82.0f, 83.0f, 83.0f, 84.0f, 85.0f, 86.0f, 87.0f, 85.0f, 84.0f, 83.0f, 81.0f, 80.0f, 78.0f, 77.0f, 75.0f, 72.0f, 69.0f, 66.0f, 63.0f},
		   {80.0f, 80.0f, 81.0f, 81.0f, 82.0f, 82.0f, 83.0f, 84.0f, 85.0f, 84.0f, 82.0f, 81.0f, 80.0f, 78.0f, 77.0f, 75.0f, 73.0f, 70.0f, 68.0f, 65.0f, 61.0f},
		   {78.0f, 78.0f, 79.0f, 80.0f, 80.0f, 81.0f, 81.0f, 82.0f, 83.0f, 82.0f, 81.0f, 79.0f, 78.0f, 77.0f, 75.0f, 73.0f, 71.0f, 69.0f, 66.0f, 63.0f, 60.0f},
		   {76.0f, 77.0f, 77.0f, 78.0f, 79.0f, 79.0f, 80.0f, 81.0f, 82.0f, 80.0f, 79.0f, 78.0f, 76.0f, 75.0f, 74.0f, 72.0f, 70.0f, 67.0f, 65.0f, 62.0f, 59.0f},
		   {75.0f, 75.0f, 76.0f, 76.0f, 77.0f, 77.0f, 78.0f, 79.0f, 80.0f, 79.0f, 77.0f, 76.0f, 75.0f, 73.0f, 72.0f, 70.0f, 68.0f, 66.0f, 63.0f, 60.0f, 57.0f},
		   {73.0f, 74.0f, 74.0f, 75.0f, 75.0f, 76.0f, 76.0f, 77.0f, 78.0f, 77.0f, 76.0f, 75.0f, 73.0f, 72.0f, 71.0f, 69.0f, 67.0f, 64.0f, 62.0f, 59.0f, 56.0f},
		   {72.0f, 72.0f, 73.0f, 73.0f, 74.0f, 74.0f, 75.0f, 76.0f, 76.0f, 75.0f, 74.0f, 73.0f, 72.0f, 71.0f, 69.0f, 67.0f, 65.0f, 63.0f, 60.0f, 57.0f, 54.0f},
		   {Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN}
		});
	private final static Table MAX_TRQ_BAD = getTable(new float[][] {
		   {129.0f, 130.0f, 131.0f, 132.0f, 133.0f, 134.0f, 135.0f, 136.0f, 138.0f, 137.0f, 136.0f, 134.0f, 132.0f, 131.0f, 129.0f, 127.0f, 125.0f, 121.0f, 117.0f, 113.0f, 109.0f},
		   {127.0f, 128.0f, 129.0f, 130.0f, 131.0f, 131.0f, 132.0f, 134.0f, 135.0f, 135.0f, 134.0f, 132.0f, 130.0f, 128.0f, 127.0f, 125.0f, 123.0f, 119.0f, 115.0f, 111.0f, 107.0f},
		   {124.0f, 125.0f, 126.0f, 127.0f, 128.0f, 129.0f, 130.0f, 131.0f, 133.0f, 132.0f, 131.0f, 130.0f, 128.0f, 126.0f, 124.0f, 122.0f, 120.0f, 117.0f, 113.0f, 109.0f, 105.0f},
		   {122.0f, 123.0f, 124.0f, 125.0f, 126.0f, 127.0f, 128.0f, 129.0f, 131.0f, 130.0f, 129.0f, 127.0f, 125.0f, 124.0f, 122.0f, 120.0f, 118.0f, 114.0f, 111.0f, 107.0f, 103.0f},
		   {120.0f, 121.0f, 122.0f, 123.0f, 124.0f, 125.0f, 125.0f, 127.0f, 128.0f, 127.0f, 127.0f, 125.0f, 123.0f, 121.0f, 120.0f, 118.0f, 116.0f, 112.0f, 109.0f, 105.0f, 101.0f},
		   {118.0f, 119.0f, 120.0f, 121.0f, 122.0f, 122.0f, 123.0f, 124.0f, 126.0f, 125.0f, 124.0f, 123.0f, 121.0f, 119.0f, 118.0f, 116.0f, 114.0f, 110.0f, 107.0f, 103.0f, 99.0f},
		   {116.0f, 117.0f, 118.0f, 119.0f, 120.0f, 120.0f, 121.0f, 122.0f, 124.0f, 123.0f, 122.0f, 120.0f, 119.0f, 117.0f, 116.0f, 114.0f, 112.0f, 108.0f, 105.0f, 101.0f, 97.0f},
		   {114.0f, 114.0f, 115.0f, 116.0f, 117.0f, 118.0f, 119.0f, 120.0f, 122.0f, 121.0f, 120.0f, 118.0f, 116.0f, 115.0f, 113.0f, 111.0f, 109.0f, 106.0f, 102.0f, 99.0f, 95.0f},
		   {112.0f, 112.0f, 113.0f, 114.0f, 115.0f, 116.0f, 117.0f, 118.0f, 119.0f, 119.0f, 118.0f, 116.0f, 114.0f, 113.0f, 111.0f, 109.0f, 107.0f, 104.0f, 100.0f, 97.0f, 93.0f},
		   {110.0f, 110.0f, 111.0f, 112.0f, 113.0f, 114.0f, 115.0f, 116.0f, 117.0f, 116.0f, 115.0f, 114.0f, 112.0f, 111.0f, 109.0f, 107.0f, 105.0f, 102.0f, 98.0f, 95.0f, 91.0f},
		   {108.0f, 108.0f, 109.0f, 110.0f, 111.0f, 112.0f, 112.0f, 114.0f, 115.0f, 114.0f, 113.0f, 112.0f, 110.0f, 109.0f, 107.0f, 105.0f, 103.0f, 100.0f, 96.0f, 93.0f, 89.0f},
		   {106.0f, 106.0f, 107.0f, 108.0f, 109.0f, 110.0f, 110.0f, 112.0f, 113.0f, 112.0f, 111.0f, 110.0f, 108.0f, 106.0f, 105.0f, 103.0f, 101.0f, 98.0f, 94.0f, 91.0f, 87.0f},
		   {104.0f, 104.0f, 105.0f, 106.0f, 107.0f, 108.0f, 108.0f, 110.0f, 111.0f, 110.0f, 109.0f, 108.0f, 106.0f, 104.0f, 103.0f, 101.0f, 99.0f, 96.0f, 92.0f, 89.0f, 85.0f},
		   {102.0f, 103.0f, 103.0f, 104.0f, 105.0f, 106.0f, 106.0f, 108.0f, 109.0f, 108.0f, 107.0f, 105.0f, 104.0f, 102.0f, 101.0f, 99.0f, 97.0f, 94.0f, 90.0f, 87.0f, 83.0f},
		   {100.0f, 101.0f, 101.0f, 102.0f, 103.0f, 104.0f, 104.0f, 106.0f, 107.0f, 106.0f, 105.0f, 103.0f, 102.0f, 100.0f, 99.0f, 97.0f, 95.0f, 92.0f, 89.0f, 85.0f, 82.0f},
		   {98.0f, 99.0f, 100.0f, 100.0f, 101.0f, 102.0f, 102.0f, 104.0f, 105.0f, 104.0f, 103.0f, 101.0f, 100.0f, 98.0f, 97.0f, 95.0f, 93.0f, 90.0f, 87.0f, 83.0f, 80.0f},
		   {96.0f, 97.0f, 98.0f, 99.0f, 99.0f, 100.0f, 101.0f, 102.0f, 103.0f, 102.0f, 101.0f, 99.0f, 98.0f, 96.0f, 95.0f, 93.0f, 91.0f, 88.0f, 85.0f, 81.0f, 78.0f},
		   {94.0f, 95.0f, 96.0f, 97.0f, 98.0f, 98.0f, 99.0f, 100.0f, 101.0f, 100.0f, 99.0f, 97.0f, 96.0f, 94.0f, 93.0f, 91.0f, 89.0f, 86.0f, 83.0f, 80.0f, 76.0f},
		   {93.0f, 93.0f, 94.0f, 95.0f, 96.0f, 96.0f, 97.0f, 98.0f, 99.0f, 98.0f, 97.0f, 95.0f, 94.0f, 92.0f, 91.0f, 89.0f, 87.0f, 84.0f, 81.0f, 78.0f, 74.0f},
		   {91.0f, 92.0f, 92.0f, 93.0f, 94.0f, 94.0f, 95.0f, 96.0f, 97.0f, 96.0f, 95.0f, 93.0f, 92.0f, 91.0f, 89.0f, 87.0f, 85.0f, 82.0f, 79.0f, 76.0f, 73.0f},
		   {89.0f, 90.0f, 91.0f, 91.0f, 92.0f, 93.0f, 93.0f, 94.0f, 95.0f, 94.0f, 93.0f, 92.0f, 90.0f, 89.0f, 87.0f, 85.0f, 83.0f, 80.0f, 78.0f, 74.0f, 71.0f},
		   {88.0f, 88.0f, 89.0f, 90.0f, 90.0f, 91.0f, 91.0f, 92.0f, 94.0f, 92.0f, 91.0f, 90.0f, 88.0f, 87.0f, 85.0f, 84.0f, 82.0f, 79.0f, 76.0f, 73.0f, 69.0f},
		   {86.0f, 87.0f, 87.0f, 88.0f, 89.0f, 89.0f, 90.0f, 91.0f, 92.0f, 91.0f, 89.0f, 88.0f, 87.0f, 85.0f, 84.0f, 82.0f, 80.0f, 77.0f, 74.0f, 71.0f, 68.0f},
		   {84.0f, 85.0f, 86.0f, 86.0f, 87.0f, 87.0f, 88.0f, 89.0f, 90.0f, 89.0f, 88.0f, 86.0f, 85.0f, 83.0f, 82.0f, 80.0f, 78.0f, 75.0f, 72.0f, 69.0f, 66.0f},
		   {83.0f, 83.0f, 84.0f, 85.0f, 85.0f, 86.0f, 86.0f, 87.0f, 88.0f, 87.0f, 86.0f, 84.0f, 83.0f, 82.0f, 80.0f, 78.0f, 76.0f, 74.0f, 71.0f, 68.0f, 64.0f},
		   {81.0f, 82.0f, 82.0f, 83.0f, 83.0f, 84.0f, 85.0f, 86.0f, 87.0f, 85.0f, 84.0f, 83.0f, 81.0f, 80.0f, 78.0f, 77.0f, 75.0f, 72.0f, 69.0f, 66.0f, 63.0f},
		   {80.0f, 80.0f, 81.0f, 81.0f, 82.0f, 82.0f, 83.0f, 84.0f, 85.0f, 84.0f, 82.0f, 81.0f, 80.0f, 78.0f, 77.0f, 75.0f, 73.0f, 70.0f, 68.0f, 65.0f, 61.0f},
		   {78.0f, 78.0f, 79.0f, 80.0f, 80.0f, 81.0f, 81.0f, 82.0f, 83.0f, 82.0f, 81.0f, 79.0f, 78.0f, 77.0f, 75.0f, 73.0f, 71.0f, 69.0f, 66.0f, 63.0f, 60.0f},
		   {76.0f, 77.0f, 77.0f, 78.0f, 79.0f, 79.0f, 80.0f, 81.0f, 82.0f, 80.0f, 79.0f, 78.0f, 76.0f, 75.0f, 74.0f, 72.0f, 70.0f, 67.0f, 65.0f, 62.0f, 59.0f},
		   {75.0f, 75.0f, 76.0f, 76.0f, 77.0f, 77.0f, 78.0f, 79.0f, 80.0f, 79.0f, 77.0f, 76.0f, 75.0f, 73.0f, 72.0f, 70.0f, 68.0f, 66.0f, 63.0f, 60.0f, 57.0f},
		   {73.0f, 74.0f, 74.0f, 75.0f, 75.0f, 76.0f, 76.0f, 77.0f, 78.0f, 77.0f, 76.0f, 75.0f, 73.0f, 72.0f, 71.0f, 69.0f, 67.0f, 64.0f, 62.0f, 59.0f, 56.0f},
		   {72.0f, 72.0f, 73.0f, 73.0f, 74.0f, 74.0f, 75.0f, 76.0f, 76.0f, 75.0f, 74.0f, 73.0f, 72.0f, 71.0f, 69.0f, 67.0f, 65.0f, 63.0f, 60.0f, 57.0f, 54.0f},
		   {Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN}
		});
	
	private final static String tables;
	
	static {
		StringBuilder sb = new StringBuilder();
		sb.append(MAX_OGE_GOOD);
		sb.append("\n");
		sb.append(MAX_OGE_BAD); 
		sb.append("\n");
		sb.append(TRQ_OGE_GOOD);
		sb.append("\n");
		sb.append(TRQ_OGE_BAD); 
		sb.append("\n");
		sb.append(TRQ_IGE_GOOD);
		sb.append("\n");
		sb.append(TRQ_IGE_BAD);
		sb.append("\n");
		sb.append(MAX_TRQ_GOOD);
		sb.append("\n");
		sb.append(MAX_TRQ_BAD);
		sb.append("\n");
		tables = sb.toString();
	}
	
	private TabDataTables() {}
	
	@Override
	public String toString() {
		return tables;
	}
	
	/**
	 * 
	 * @param table is the processed tab data in chart form.
	 * @return Table of Tab Data.
	 */
	private static Table getTable(float[][] table) {
		return Table.builder()
				   .withData(table)
				   .rowMin(0f)
				   .rowMax(16000f)
				   .rowInterval(500f)
				   .columnMin(-45f)
				   .columnMax(55f)
				   .columnInterval(5f)
				   .build();
	}
	
	private static float interpolate(float ratio, float cap, float base) {
		return ((cap - base) * ratio) + base;
	}
	
	public static float getGrossWeight(float atf, float pa, float temp) {
		return interpolate(atf * 10 - 9, MAX_OGE_GOOD.interpolate(pa, temp),
									  MAX_OGE_BAD.interpolate(pa, temp));
	}

	public static float get_q_ige_percent(float atf, float pa, float temp) {
		return interpolate(atf * 10 - 9, TRQ_IGE_GOOD.interpolate(pa, temp), 
									  TRQ_IGE_BAD.interpolate(pa, temp));
	}

	public static float get_q_oge_percent(float atf, float pa, float temp) {
		return interpolate(atf * 10 - 9, TRQ_OGE_GOOD.interpolate(pa, temp), 
									  TRQ_OGE_BAD.interpolate(pa, temp));
	}

	public static float get_max_q_percent(float atf, float pa, float temp) {
		return interpolate(atf * 10 - 9, MAX_TRQ_GOOD.interpolate(pa, temp), 
				   					  MAX_TRQ_BAD.interpolate(pa, temp));
	}
	
}

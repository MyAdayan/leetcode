/**
 * �ҳ��������ظ�������
 * ��Ŀ����
 * ��һ������Ϊ n ����������������ֶ��� 0 �� n-1 �ķ�Χ�ڡ�������ĳЩ�������ظ��ģ�����֪���м��������ظ��ˣ�Ҳ��֪��ÿ�������ظ��˼��Ρ����ҳ�����������һ���ظ������֡����磬������볤��Ϊ 7 ������ {2, 3, 1, 0, 2, 5, 3}����ô��Ӧ��������ظ������� 2 ���� 3��
 *
 * �ⷨ
 * �ⷨһ
 * �����˳��ɨ�裬�ж��Ƿ����ظ���ʱ�临�Ӷ�Ϊ O(n?)��
 *
 * �ⷨ��
 * ���ù�ϣ���������飬�����ϣ����û�и�Ԫ�أ�������ϣ���У����򷵻��ظ���Ԫ�ء�ʱ�临�Ӷ�Ϊ O(n)���ռ临�Ӷ�Ϊ O(n)��
 *
 * �ⷨ��
 * ����Ϊ n��Ԫ�ص���ֵ��ΧҲΪ n�����û���ظ�Ԫ�أ���ô����ÿ���±��Ӧ��ֵ���±���ȡ�
 *
 * ��ͷ��β�������飬��ɨ�赽�±� i ������ nums[i]��
 *
 * ������� i����������ɨ�裻
 * ��������� i��������� nums[i] �������бȽϣ������ȣ�˵�����ظ�ֵ������ nums[i]���������ȣ��Ͱѵ� i ���� �͵� nums[i] �����������ظ�����ȽϽ����Ĺ��̡�
 * ���㷨ʱ�临�Ӷ�Ϊ O(n)����Ϊÿ��Ԫ�����ֻҪ���ν���������ȷ��λ�á��ռ临�Ӷ�Ϊ O(1)��
 */




public class findDuplicateFromArray {
    /**
     * ���������е��ظ�Ԫ��
     * @param numbers ����
     * @param length ���鳤��
     * @param duplication duplication[0]�洢�ظ�Ԫ��
     * @return boolean
     */
    public boolean duplicate(int[] numbers, int length, int[] duplication) {
        if (numbers == null || length < 1) {
            return false;
        }
        for (int e : numbers) {
            if (e >= length) {
                return false;
            }
        }

        for (int i = 0; i < length; i++) {
            while (numbers[i] != i) {
                if (numbers[i] == numbers[numbers[i]]) {
                    duplication[0] = numbers[i];
                    return true;
                }
                swap(numbers,i,numbers[i]);
            }
        }
        return false;
    }

    private void swap(int[] numbers, int i, int j){
        int t = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = t;
    }
}
